# ⚡ MatrixCore — Generic J2ME Modding Framework

A lightweight, modular bytecode-injection framework and automated build environment for reverse-engineering and modding J2ME (`.jar`) games.

---

## 📁 Repository Layout

```
matrixcore/
├── build.sh                             # One-click build, patch & repack script
├── README.md                            # Setup and modding reference guide
├── .gitignore                           # Excludes build output and dist artifacts
├── input/                               # Place your target game .jar file here
├── lib/                                 # Compilers, Javassist & J2ME stubs
│   ├── cldcapi11.jar
│   ├── ecj.jar
│   ├── javassist.jar
│   └── midpapi20.jar
├── src/
│   ├── mod/                             # Modular Java Mod Code (J2ME CLDC 1.1 / MIDP 2.0)
│   │   ├── MatrixAPI.java               # Central entry point for bytecode hooks
│   │   ├── ui/MatrixUI.java             # Menu handlers & UI overlays
│   │   ├── net/MatrixNet.java           # Network packet telemetry
│   │   └── log/MatrixLogger.java        # Console logging engine
│   └── patcher/
│       └── Patcher.java                 # Javassist bytecode instrumenter
└── dist/                                # Output directory for patched runnable JARs
```

---

## 🚀 Quick Start Guide

### Step 1: Add Your Target Game JAR
Drop your target game `.jar` file into the `input/` directory:
```bash
cp /path/to/mygame.jar input/
```

### Step 2: Configure Bytecode Hooks in `src/patcher/Patcher.java`
Decompile your target JAR (using CFR, Recaf, or Bytecode Viewer) to identify key class and method names.

In `src/patcher/Patcher.java`, configure your Javassist hooks:

```java
// Hook game startup
CtClass mainMIDlet = pool.get("com.game.MainMIDlet");
CtMethod startApp = mainMIDlet.getDeclaredMethod("startApp");
startApp.insertBefore("{ mod.MatrixAPI.init(); }");
mainMIDlet.writeFile(outputPath);
```

### Step 3: Add Custom Mod Logic in `src/mod/MatrixAPI.java`
Implement custom features, overlay rendering, key event listeners, or packet processing in the `src/mod/` packages.

### Step 4: Run the Automated Builder
Execute the build script:
```bash
./build.sh
```

Or specify a target JAR directly:
```bash
./build.sh input/mygame.jar
```

The compiled and patched runnable JAR will be generated in `dist/<jar_name>_MatrixMOD.jar`.
