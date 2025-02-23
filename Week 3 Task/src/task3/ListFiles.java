 
package task3;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File directory = new File(".");
        String[] files = directory.list();

        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory is empty or doesn't exist.");
        }
    }
}
