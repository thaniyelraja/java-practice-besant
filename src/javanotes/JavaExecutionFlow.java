package javanotes;

public class JavaExecutionFlow {
    public static void main(String[] args) {

        // ============================================
        //        JAVA PROGRAM EXECUTION FLOW
        // ============================================

        /*
         * STEP 1: Writing the Java Program
         * --------------------------------
         * You write code in a .java file using any editor (Eclipse, VS Code, Notepad).
         * Example: HelloWorld.java
         */

        /*
         * STEP 2: Compilation (javac)
         * ---------------------------
         * Command: javac HelloWorld.java
         *
         * The Java Compiler (javac) converts:
         *      .java file  --->  .class file
         *
         * The .class file contains BYTECODE (not machine code).
         */

        /*
         * STEP 3: Bytecode
         * ----------------
         * Bytecode is platform-independent.
         * It is not understandable by humans or directly by machines.
         */

        /*
         * STEP 4: Java Virtual Machine (JVM)
         * ---------------------------------
         * JVM executes the bytecode.
         * JVM is platform-dependent.
         */

        /*
         * STEP 5: Class Loader Subsystem
         * ------------------------------
         * Loads the .class file into memory.
         *
         * Types of Class Loaders:
         * - Bootstrap ClassLoader
         * - Extension ClassLoader
         * - Application ClassLoader
         */

        /*
         * STEP 6: Bytecode Verifier
         * --------------------------
         * Checks the bytecode for security:
         * - No illegal memory access
         * - No data type violations
         * Ensures program is safe to execute.
         */

        /*
         * STEP 7: Execution Engine
         * ------------------------
         * Converts bytecode into machine code.
         *
         * Two parts:
         * 1. Interpreter → Executes line by line (slower)
         * 2. JIT Compiler (Just-In-Time) → Converts to native code (faster)
         */

        /*
         * STEP 8: Runtime Data Areas (Memory)
         * ----------------------------------
         * JVM creates memory areas:
         *
         * - Method Area → Class data, static variables
         * - Heap → Objects
         * - Stack → Method calls, local variables
         * - PC Register → Current instruction
         * - Native Method Stack → Native methods
         */

        /*
         * STEP 9: Garbage Collection
         * ---------------------------
         * JVM automatically removes unused objects from heap memory.
         * This helps in memory management.
         */

        /*
         * STEP 10: Program Execution
         * ---------------------------
         * JVM executes the main() method.
         * Output is displayed on console.
         */
    	
    	/*
         * DIAGRAMMATIC REPRESENTATION
         * ===========================
         *
         *     .java file (Source Code)
         *              |
         *              v
         *        javac (Compiler)
         *              |
         *              v
         *       .class file (Bytecode)
         *              |
         *              v
         *        Class Loader
         *              |
         *              v
         *     Bytecode Verifier
         *              |
         *              v
         *      Execution Engine
         *      (Interpreter + JIT)
         *              |
         *              v
         *         Machine Code
         *              |
         *              v
         *           Output
         *
         */

        System.out.println("Java Execution Flow Explained Successfully!");
    }
}