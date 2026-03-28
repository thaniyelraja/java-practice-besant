package javanotes;

public class CollectionsFramework {

    // ==========================================================
    //        JAVA COLLECTION FRAMEWORK (JCF)
    // ==========================================================

    /*
     * WHAT IS COLLECTION FRAMEWORK?
     * ------------------------------
     * Java Collection Framework (JCF) is a set of classes and interfaces
     * used to store and manipulate groups of objects dynamically.
     */

    /*
     * WHY COLLECTIONS?
     * -----------------
     * - Dynamic size (unlike arrays)
     * - Built-in methods (sorting, searching)
     * - Efficient data handling
     */

    // ==========================================================
    // COLLECTION HIERARCHY (DIAGRAM)
    // ==========================================================

    /*
     *                Iterable
     *                    |
     *               Collection
     *        ------------------------
     *        |          |           |
     *       List       Set        Queue
     *
     *       Map (Separate hierarchy)
     */

    // ==========================================================
    // 1. LIST INTERFACE
    // ==========================================================

    /*
     * Characteristics:
     * - Ordered
     * - Allows duplicates
     * - Index-based access
     */

    /*
     * Common Classes:
     *
     * 1. ArrayList
     *    - Dynamic array
     *    - Fast access (index)
     *    - Slow insertion/deletion
     *
     * 2. LinkedList
     *    - Doubly linked list
     *    - Fast insertion/deletion
     *    - Slow access
     *
     * 3. Vector
     *    - Synchronized (thread-safe)
     *    - Slower than ArrayList
     */

    // ==========================================================
    // 2. SET INTERFACE
    // ==========================================================

    /*
     * Characteristics:
     * - No duplicates
     * - Unordered (generally)
     */

    /*
     * Common Classes:
     *
     * 1. HashSet
     *    - No order
     *    - Fast performance
     *
     * 2. LinkedHashSet
     *    - Maintains insertion order
     *
     * 3. TreeSet
     *    - Sorted order
     *    - Uses Red-Black Tree
     */

    // ==========================================================
    // 3. QUEUE INTERFACE
    // ==========================================================

    /*
     * Characteristics:
     * - FIFO (First In First Out)
     */

    /*
     * Common Classes:
     *
     * 1. PriorityQueue
     *    - Elements sorted by priority
     *
     * 2. ArrayDeque
     *    - Double-ended queue
     */

    // ==========================================================
    // 4. MAP INTERFACE (SEPARATE)
    // ==========================================================

    /*
     * Characteristics:
     * - Stores key-value pairs
     * - Keys must be unique
     */

    /*
     * Common Classes:
     *
     * 1. HashMap
     *    - No order
     *    - Fast performance
     *
     * 2. LinkedHashMap
     *    - Maintains insertion order
     *
     * 3. TreeMap
     *    - Sorted by keys
     */

    // ==========================================================
    // IMPORTANT DIFFERENCES
    // ==========================================================

    /*
     * ArrayList vs LinkedList:
     * - ArrayList → fast access
     * - LinkedList → fast insertion/deletion
     */

    /*
     * HashSet vs TreeSet:
     * - HashSet → no order
     * - TreeSet → sorted
     */

    /*
     * HashMap vs TreeMap:
     * - HashMap → unordered
     * - TreeMap → sorted by keys
     */

    // ==========================================================
    // USAGE (WHEN TO USE WHAT)
    // ==========================================================

    /*
     * Use ArrayList:
     * - When frequent access is needed
     */

    /*
     * Use LinkedList:
     * - When frequent insertion/deletion
     */

    /*
     * Use HashSet:
     * - When duplicates not allowed
     */

    /*
     * Use TreeSet:
     * - When sorted data required
     */

    /*
     * Use HashMap:
     * - For fast key-value storage
     */

    /*
     * Use TreeMap:
     * - When sorted keys required
     */

    // ==========================================================
    // IMPORTANT INTERVIEW POINTS
    // ==========================================================

    /*
     * - List → allows duplicates
     * - Set → no duplicates
     * - Map → key-value pairs
     * - Queue → FIFO
     */

    // ==========================================================
    // SUMMARY
    // ==========================================================

    /*
     * Java Collection Framework provides efficient ways
     * to store, retrieve, and manipulate data dynamically.
     */

}