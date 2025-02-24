// Coding Question:

// Write a static method in Java that takes a string as input and determines 
// whether the given string is a palindrome or not. A
//  palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

// Method signature:
// ```java

public class PalindromeChecker {
  public static boolean isPalindrome(String str) {
    if (str == null)
      return false; // Handle null input

    String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int left = 0, right = cleanedStr.length() - 1; // Checks the palindrome from left as null and carry on

    while (left < right) {
      if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
        return false; // Not a palindrome

      }

      left++;
      right--;
    }
    return true; // It's a palindrome
  }

  public static void main(String[] args) {

    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("hello"));

  }

}
