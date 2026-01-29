import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        // Create a HashSet
        // Stores unique elements only
        // No index, no duplicates, unordered
        HashSet<Integer> set = new HashSet<>();

        // ------------------ ADD ------------------
        // add() returns false if element already exists
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);   // duplicate -> ignored

        // ------------------ PRINT ------------------
        // Order is NOT guaranteed
        System.out.println(set);

        // ------------------ CONTAINS ------------------
        // Check if element exists
        System.out.println(set.contains(20)); // true
        System.out.println(set.contains(40)); // false

        // ------------------ REMOVE ------------------
        // Removes element if present
        set.remove(20);
        System.out.println(set);

        // ------------------ SIZE & EMPTY ------------------
        // Number of elements
        System.out.println(set.size());

        // Check if set is empty
        System.out.println(set.isEmpty());

        // ------------------ ITERATION ------------------

        // 1️⃣ Using for-each loop (most common)
        for (int x : set) {
            System.out.println("Element: " + x);
        }

        // 2️⃣ Using Iterator (INTERVIEW FAVORITE)
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // ------------------ SPECIAL FEATURES ------------------

        // HashSet allows ONE null value
        set.add(null);
        System.out.println(set);

        // ------------------ CLEAR ------------------
        // Removes all elements
        set.clear();

        // Check set after clear
        System.out.println(set);        // []
        System.out.println(set.isEmpty()); // true
    }
}
