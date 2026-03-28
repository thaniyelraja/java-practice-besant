package javanotes;

public class JVM_JRE_JDK {

    // ==========================================================
    //              JVM, JRE, JDK (OVERVIEW)
    // ==========================================================

    /*
     * JDK (Java Development Kit)
     * ---------------------------
     * - Used for developing Java applications
     * - Contains:
     *      JRE + Development Tools (javac, debugger, etc.)
     */

    /*
     * JRE (Java Runtime Environment)
     * -------------------------------
     * - Used to run Java programs
     * - Contains:
     *      JVM + Libraries
     */

    /*
     * JVM (Java Virtual Machine)
     * ---------------------------
     * - Executes Java bytecode (.class file)
     * - Makes Java platform independent
     */

    // ==========================================================
    // RELATION DIAGRAM
    // ==========================================================

    /*
     *
     *        +---------------------------+
     *        |           JDK             |
     *        |---------------------------|
     *        |   Development Tools       |
     *        |   (javac, jdb, etc.)      |
     *        |       +-------------+     |
     *        |       |     JRE     |     |
     *        |       |-------------|     |
     *        |       |     JVM     |     |
     *        |       +-------------+     |
     *        +---------------------------+
     *
     */

    // ==========================================================
    // JVM SUBSYSTEMS
    // ==========================================================

    /*
     * JVM consists of:
     *
     * 1. Class Loader Subsystem
     * 2. Runtime Data Areas
     * 3. Execution Engine
     * 4. Native Interface
     */

    // ==========================================================
    // 1. CLASS LOADER SUBSYSTEM
    // ==========================================================

    /*
     * Loads .class file into memory.
     *
     * Types:
     * - Bootstrap ClassLoader
     * - Extension ClassLoader
     * - Application ClassLoader
     *
     * Phases:
     * - Loading
     * - Linking
     *      → Verification
     *      → Preparation
     *      → Resolution
     * - Initialization
     */

    // ==========================================================
    // 2. RUNTIME DATA AREAS
    // ==========================================================

    /*
     * JVM memory areas:
     *
     * - Method Area → class data, static variables
     * - Heap        → objects
     * - Stack       → local variables, method calls
     * - PC Register → current instruction
     * - Native Stack → native methods
     */

    // ==========================================================
    // 3. EXECUTION ENGINE
    // ==========================================================

    /*
     * Executes bytecode.
     *
     * Components:
     * - Interpreter → executes line by line
     * - JIT Compiler → converts to native code
     * - Garbage Collector → removes unused objects
     */

    // ==========================================================
    // 4. NATIVE INTERFACE (JNI)
    // ==========================================================

    /*
     * Allows Java to interact with native languages (C/C++).
     */

    // ==========================================================
    // JVM ARCHITECTURE DIAGRAM
    // ==========================================================

    /*
     *
     *        .class file
     *             |
     *             v
     *     +----------------------+
     *     |   Class Loader       |
     *     +----------------------+
     *             |
     *             v
     *     +----------------------+
     *     | Runtime Data Areas   |
     *     | (Heap, Stack, etc.)  |
     *     +----------------------+
     *             |
     *             v
     *     +----------------------+
     *     |  Execution Engine    |
     *     | (Interpreter + JIT)  |
     *     +----------------------+
     *             |
     *             v
     *         Output
     *
     */

    // ==========================================================
    // IMPORTANT INTERVIEW POINTS
    // ==========================================================

    /*
     * - JDK = JRE + Development Tools
     * - JRE = JVM + Libraries
     * - JVM executes bytecode
     *
     * - Class Loader loads classes
     * - Execution Engine runs code
     * - Runtime Areas manage memory
     */

    // ==========================================================
    // SUMMARY
    // ==========================================================

    /*
     * JDK is used to develop,
     * JRE is used to run,
     * JVM is used to execute Java programs.
     */

}