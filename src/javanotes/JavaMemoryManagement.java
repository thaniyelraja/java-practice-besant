package javanotes;

public class JavaMemoryManagement {

    // ==========================================================
    //          JAVA MEMORY MANAGEMENT (DETAILED)
    // ==========================================================

    /*
     * WHAT IS MEMORY MANAGEMENT?
     * --------------------------
     * Memory management in Java is handled by JVM.
     * It allocates and deallocates memory automatically.
     * Garbage Collector removes unused objects.
     */

    // ==========================================================
    // JVM MEMORY STRUCTURE
    // ==========================================================

    /*
     * JVM divides memory into:
     *
     * 1. Method Area
     * 2. Heap Memory
     * 3. Stack Memory
     * 4. PC Register
     * 5. Native Method Stack
     */

    // ==========================================================
    // 1. METHOD AREA
    // ==========================================================

    /*
     * Stores:
     * - Class metadata
     * - Static variables
     * - Method definitions
     * - Constant pool
     *
     * Shared among all threads.
     */

    // ==========================================================
    // 2. HEAP MEMORY
    // ==========================================================

    /*
     * Stores:
     * - Objects
     * - Instance variables
     *
     * Managed by Garbage Collector.
     *
     * Divided into:
     * - Young Generation
     * - Old Generation
     */

    // ==========================================================
    // 3. STACK MEMORY
    // ==========================================================

    /*
     * Stores:
     * - Method calls
     * - Local variables
     * - Primitive data
     *
     * Each thread has its own stack.
     */

    // ==========================================================
    // MEMORY ALLOCATION BASED ON DATA TYPES
    // ==========================================================

    /*
     * PRIMITIVE DATA TYPES
     * ---------------------
     * Stored in STACK memory (inside method).
     *
     * Examples:
     * int, float, double, char, boolean, byte, short, long
     *
     * These store actual values directly.
     */

    /*
     * REFERENCE (NON-PRIMITIVE) DATA TYPES
     * -------------------------------------
     * Reference variable → stored in STACK
     * Object (actual data) → stored in HEAP
     *
     * Examples:
     * String, Arrays, Objects
     */

    /*
     * Example Flow:
     *
     * String s = "Hello";
     *
     * STACK → stores reference 's'
     * HEAP  → stores actual "Hello" object
     */

    // ==========================================================
    // MEMORY STRUCTURE DIAGRAM
    // ==========================================================

    /*
     *            STACK MEMORY                HEAP MEMORY
     *         -------------------         -------------------
     *         int a = 10                  Object data
     *         String s -----------▶      "Hello"
     *         ref variable               instance variables
     *
     *         Method calls               Objects
     *         local variables
     */

    // ==========================================================
    // VARIABLE TYPES & MEMORY
    // ==========================================================

    /*
     * 1. LOCAL VARIABLES
     * -------------------
     * - Stored in STACK
     * - Created inside methods
     */

    /*
     * 2. INSTANCE VARIABLES
     * ----------------------
     * - Stored in HEAP
     * - Belong to object
     */

    /*
     * 3. STATIC VARIABLES
     * --------------------
     * - Stored in METHOD AREA
     * - Shared across all objects
     */

    // ==========================================================
    // DATA TYPE MEMORY DETAILS
    // ==========================================================

    /*
     * byte   → 1 byte (stack if local)
     * short  → 2 bytes
     * int    → 4 bytes
     * long   → 8 bytes
     * float  → 4 bytes
     * double → 8 bytes
     * char   → 2 bytes
     * boolean → JVM dependent
     */

    /*
     * NOTE:
     * Primitive values stored directly.
     * Reference types store address of object.
     */

    // ==========================================================
    // GARBAGE COLLECTION
    // ==========================================================

    /*
     * JVM automatically deletes unused objects from HEAP.
     *
     * Example:
     * If reference becomes null or lost,
     * object becomes eligible for garbage collection.
     */

    /*
     * Advantages:
     * - Prevents memory leaks
     * - Automatic memory management
     */

    // ==========================================================
    // IMPORTANT INTERVIEW POINTS
    // ==========================================================

    /*
     * - Stack → stores primitive + reference variables
     * - Heap → stores objects
     * - Method Area → stores static data
     * - JVM handles memory automatically
     * - Garbage Collector cleans heap memory
     */

    // ==========================================================
    // SUMMARY
    // ==========================================================

    /*
     * Java memory is divided into Stack, Heap, and Method Area.
     * Primitive data is stored in stack,
     * objects are stored in heap,
     * and static data is stored in method area.
     */
	
	// ==========================================================
    //            JVM MEMORY STRUCTURE (DIAGRAM)
    // ==========================================================

    /*
     *
     *                +-------------------------+
     *                |      METHOD AREA        |
     *                |-------------------------|
     *                | Class Metadata          |
     *                | Static Variables        |
     *                | Constant Pool           |
     *                +-------------------------+
     *
     *
     *                +-------------------------+
     *                |        HEAP MEMORY      |
     *                |-------------------------|
     *                | Objects                |
     *                | Instance Variables     |
     *                | (GC Managed Area)      |
     *                +-------------------------+
     *
     *
     *     +-------------------------+
     *     |        STACK MEMORY     |
     *     |-------------------------|
     *     | Method Calls           |
     *     | Local Variables        |
     *     | Reference Variables    |
     *     +-------------------------+
     *
     *
     *     +-------------------------+
     *     |      PC REGISTER        |
     *     |-------------------------|
     *     | Current Instruction     |
     *     +-------------------------+
     *
     *
     *     +-------------------------+
     *     |  NATIVE METHOD STACK    |
     *     |-------------------------|
     *     | Native Method Calls     |
     *     +-------------------------+
     *
     */

}