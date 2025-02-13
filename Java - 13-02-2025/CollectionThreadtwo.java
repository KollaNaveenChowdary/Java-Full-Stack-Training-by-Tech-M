import java.util.*;

class CollectionThreadtwo {
    public static void main(String[] args) {
        // HashSet<Integer> with at least 8 elements
        HashSet<Integer> intSet = new HashSet<>(Arrays.asList(7, 14, 21, 29, 35, 42, 49, 56,));
        // LinkedHashSet<String> with at least 8 elements
        LinkedHashSet<String> strSet = new LinkedHashSet<>(Arrays.asList("hello", "world", "java", "springboot", "hibernate", "developer", "backend", "frontend"));
        // TreeSet<Float> with at least 8 elements
        TreeSet<Float> floatSet = new TreeSet<>(Arrays.asList(10.5f, 15.2f, 20.3f, 25.6f, 30.8f, 35.0f, 40.2f, 45.3f));

        // Invoke methods
        setSample(intSet);
        setSample(strSet);
        setSample(floatSet);
    }

    // HashSet<Integer> processing
    public static void setSample(HashSet<Integer> hs) {
        System.out.println("\nProcessing HashSet<Integer>...");
        // Removing one element
        hs.remove(hs.iterator().next());
        System.out.println("After removal: " + hs);

        // Filtering numbers divisible by 7
        hs.removeIf(n -> n % 7 != 0);

        // Ensuring minimum 4 elements
        while (hs.size() < 4) {
            hs.add((int) (Math.random() * 100)); // Adding random values
        }
        System.out.println("Elements divisible by 7: " + hs);
    }

    // LinkedHashSet<String> processing
    public static void setSample(LinkedHashSet<String> hs) {
        System.out.println("\nProcessing LinkedHashSet<String>...");
  
        hs.remove(hs.iterator().next());
        System.out.println("After removal: " + hs);

        hs.removeIf(str -> str.length() <= 5);

        while (hs.size() < 4) {
            hs.add("random" + (int) (Math.random() * 100)); // Adding dummy strings
        }
        System.out.println("Strings with length > 5: " + hs);
    }

    // TreeSet<Float> processing
    public static void setSample(TreeSet<Float> hs) {
        System.out.println("\nProcessing TreeSet<Float>...");
  
        hs.pollFirst();
        System.out.println("After removal: " + hs);

        hs.removeIf(f -> f <= 20);

        while (hs.size() < 4) {
            hs.add(20 + (float) (Math.random() * 30)); // Adding random values above 20
        }
        System.out.println("Elements greater than 20: " + hs);
    }
}
