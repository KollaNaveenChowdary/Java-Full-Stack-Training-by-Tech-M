 
package task6;

import java.util.*;

public class ReverseList {
    public static <T> List<T> reverse(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original: " + numbers);
        System.out.println("Reversed: " + reverse(numbers));
    }
}
