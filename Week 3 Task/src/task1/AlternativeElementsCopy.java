 
package task1;

import java.util.Arrays;

public class AlternativeElementsCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] alternative = new int[(original.length + 1) / 2];

        for (int i = 0, j = 0; i < original.length; i += 2, j++) {
            alternative[j] = original[i];
        }

        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Alternative Elements Array: " + Arrays.toString(alternative));
    }
}
