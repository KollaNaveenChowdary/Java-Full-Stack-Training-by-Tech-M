import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Using Hashtable instead of HashMap
        Hashtable<Integer, String> hm = new Hashtable<>();
        
        // Adding elements
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");        

        System.out.println("Initial Hashtable hm: " + hm);

        // Updating an existing key
        hm.put(2, "For");
        System.out.println("Updated Map: " + hm);

        // Removing an element
        hm.remove(1);
        System.out.println("Mappings after removal: " + hm);

        // Iterating over the map
        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
}
