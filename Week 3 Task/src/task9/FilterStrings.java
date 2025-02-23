 
package task9;

import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Alex");
        long count = names.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("Number of names starting with 'A': " + count);
    }
}
