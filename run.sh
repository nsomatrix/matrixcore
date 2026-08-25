#!/usr/bin/env bash

# ==============================================================================
# ⚡ MatrixCore J2ME Emulator Launch Script
# Launches dist/matrixcore.jar in the Neutron J2ME Emulator (lib/neutron.jar)
# ==============================================================================

set -e

PROJECT_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$PROJECT_ROOT"

EMULATOR_JAR="lib/neutron.jar"
TARGET_JAR="dist/matrixcore.jar"

# Check if emulator exists
if [ ! -f "$EMULATOR_JAR" ]; then
    echo "❌ Error: Emulator JAR not found at: $EMULATOR_JAR"
    exit 1
fi

# Auto-build target JAR if it doesn't exist yet
if [ ! -f "$TARGET_JAR" ]; then
    echo "⚠️ Target JAR not found ($TARGET_JAR). Running automated build first..."
    ./build.sh input/nso.jar
fi

echo "=================================================="
echo "⚡ Launching MatrixCore in Neutron J2ME Emulator... ⚡"
echo "--------------------------------------------------"
echo "🎮 Target JAR: $TARGET_JAR"
echo "🕹️ Emulator:   $EMULATOR_JAR"
echo "=================================================="

# Run Neutron with target JAR
java -jar "$EMULATOR_JAR" "$TARGET_JAR" "$@"
