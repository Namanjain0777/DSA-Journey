import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create a HashMap
        // Key   -> String
        // Value -> Integer
        HashMap<String, Integer> map = new HashMap<>();

        // ------------------ PUT ------------------
        // Adds key-value pair
        // If key already exists, value will be updated
        map.put("apple", 2);
        map.put("banana", 5);
        map.put("apple", 3);   // updates value of "apple"

        // ------------------ GET ------------------
        // Returns value of the key
        // Returns null if key not found
        System.out.println(map.get("apple"));   // 3
        System.out.println(map.get("mango"));   // null

        // ------------------ REMOVE ------------------
        // Removes key and returns its value
        System.out.println(map.remove("banana")); // 5

        // ------------------ CONTAINS ------------------
        // Check if key exists
        System.out.println(map.containsKey("apple"));  // true

        // Check if value exists
        System.out.println(map.containsValue(5));       // false

        // ------------------ SIZE & EMPTY ------------------
        // Number of key-value pairs
        System.out.println(map.size());

        // Check if map is empty
        System.out.println(map.isEmpty());

        // ------------------ ITERATION ------------------

        // 1️⃣ Iterate using keySet()
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 2️⃣ Iterate using values()
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 3️⃣ Iterate using entrySet() (BEST way)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // ------------------ DEFAULT METHODS ------------------

        // getOrDefault() -> returns default if key not present
        System.out.println(map.getOrDefault("mango", 0));

        // putIfAbsent() -> adds only if key not present
        map.putIfAbsent("apple", 10);   // won't change existing value
        map.putIfAbsent("mango", 7);    // added

        // replace() -> updates value only if key exists
        map.replace("apple", 100);

        // ------------------ FINAL MAP ------------------
        System.out.println(map);

        // ------------------ CLEAR ------------------
        // Removes all entries
        map.clear();

        // Check map after clear
        System.out.println(map);         // {}
        System.out.println(map.isEmpty()); // true
    }
}