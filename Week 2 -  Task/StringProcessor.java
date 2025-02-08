public class StringProcessor {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static String[] splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return words;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Reversed: " + reverseString(str));
        System.out.println("Occurrences of 'l': " + countOccurrences(str, "l"));
        String[] capitalizedWords = splitAndCapitalize(str);
        for (String word : capitalizedWords) {
            System.out.println(word);
        }
    }
}