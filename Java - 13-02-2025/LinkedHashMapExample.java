import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Using LinkedHashMap instead of Hashtable
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        
        // Adding elements
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");        

        System.out.println("Initial LinkedHashMap hm: " + hm);

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

