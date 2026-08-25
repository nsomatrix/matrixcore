#!/bin/bash
set -e

BASE_DIR="$(cd "$(dirname "$0")" && pwd)"
LIB_DIR="$BASE_DIR/lib"
SRC_DIR="$BASE_DIR/src"
INPUT_DIR="$BASE_DIR/input"
DIST_DIR="$BASE_DIR/dist"
BUILD_DIR="$BASE_DIR/build_output"

echo "=================================================="
echo "   ⚡ MatrixCore Automated J2ME Mod Builder ⚡    "
echo "=================================================="

# 0. Locate Input JAR
if [ -n "$1" ] && [ -f "$1" ]; then
    INPUT_JAR="$1"
else
    # Find first .jar in input directory
    INPUT_JAR=$(find "$INPUT_DIR" -maxdepth 1 -name "*.jar" | head -n 1)
fi

if [ -z "$INPUT_JAR" ] || [ ! -f "$INPUT_JAR" ]; then
    echo "❌ ERROR: No target J2ME JAR found in $INPUT_DIR"
    echo "💡 Usage: Put your target game .jar in 'input/' directory, or run:"
    echo "   ./build.sh input/your_game.jar"
    exit 1
fi

JAR_BASENAME=$(basename "$INPUT_JAR" .jar)
DIST_JAR="$DIST_DIR/matrixcore.jar"

echo "🎯 Target Input JAR: $INPUT_JAR"
echo "📦 Output Target:   $DIST_JAR"
echo "--------------------------------------------------"

# Clean & create build folders
rm -rf "$BUILD_DIR"
mkdir -p "$BUILD_DIR/mod_classes" "$BUILD_DIR/patcher_classes" "$BUILD_DIR/patched_classes" "$DIST_DIR"

echo "🔨 [1/4] Compiling MatrixCore Facade & Subpackages (Target: J2ME CLDC 1.1 / MIDP 2.0)..."
MOD_FILES=$(find "$SRC_DIR/mod" -name "*.java")
java -jar "$LIB_DIR/ecj.jar" -1.3 \
  -cp "$LIB_DIR/midpapi20.jar:$LIB_DIR/cldcapi11.jar:$INPUT_JAR" \
  -d "$BUILD_DIR/mod_classes" \
  $MOD_FILES

echo "🔨 [2/4] Compiling Bytecode Patcher..."
PATCHER_FILES=$(find "$SRC_DIR/patcher" -name "*.java")
java -jar "$LIB_DIR/ecj.jar" -1.8 \
  -cp "$LIB_DIR/javassist.jar:$LIB_DIR/midpapi20.jar:$LIB_DIR/cldcapi11.jar:$INPUT_JAR:$BUILD_DIR/mod_classes" \
  -d "$BUILD_DIR/patcher_classes" \
  $PATCHER_FILES

echo "⚡ [3/4] Instrumenting Bytecode..."
java -cp "$BUILD_DIR/patcher_classes:$LIB_DIR/javassist.jar:$LIB_DIR/midpapi20.jar:$LIB_DIR/cldcapi11.jar:$INPUT_JAR:$BUILD_DIR/mod_classes" \
  patcher.Patcher "$INPUT_JAR" "$BUILD_DIR/mod_classes" "$BUILD_DIR/patched_classes"

echo "📦 [4/4] Repacking Runnable J2ME JAR..."
cp "$INPUT_JAR" "$DIST_JAR"

# Overwrite patched classes if any were produced
if [ "$(ls -A "$BUILD_DIR/patched_classes" 2>/dev/null)" ]; then
    cd "$BUILD_DIR/patched_classes"
    zip -u -r "$DIST_JAR" . > /dev/null
    cd "$BASE_DIR"
fi

# Add mod classes to JAR
cd "$BUILD_DIR/mod_classes"
zip -u -r "$DIST_JAR" mod/ > /dev/null
cd "$BASE_DIR"

echo "=================================================="
echo " ✅ BUILD SUCCESSFUL!"
echo " 📁 Output File: $DIST_JAR"
echo " 📦 File Size:   $(du -h "$DIST_JAR" | cut -f1)"
echo "=================================================="
