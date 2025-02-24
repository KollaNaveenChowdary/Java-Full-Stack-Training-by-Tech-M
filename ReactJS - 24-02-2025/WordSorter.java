// Question:
// You are given a string input that contains a list of words separated by spaces.
//  Write a static method in Java called "sortWords" that takes the string input as a parameter
//  and returns a new string with the words sorted alphabetically.

// Method signature:
// ```java
// public static String sortWords(String input)
// ```

// Example:
// Input:
// "banana apple orange grape"

// Output:
// "apple banana grape orange"

// Input:
// "zebra lion tiger elephant"

// Output:
// "elephant lion tiger zebra"

// Note:Null would return null

import java.util.Arrays;

public class WordSorter {
    public static String sortWords(String input) {
        if (input == null) {
            return null;
        }

        String[] words = input.split(" ");
        Arrays.sort(words);

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(sortWords("banana apple orange grape")); // "apple banana grape orange"
        System.out.println(sortWords("zebra lion tiger elephant")); // "elephant lion tiger zebra"
        System.out.println(sortWords(null)); // null
        System.out.println(sortWords("")); // " "
    }
}
