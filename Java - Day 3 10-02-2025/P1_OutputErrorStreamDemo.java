public class P1_OutputErrorStreamDemo {
    public static void main(String[] args) {
        /*System.out.print("System.out.print! ");
        System.out.print("System.out.print! ");
        System.out.print("System.out.print!\n ");
        System.out.println("System.out.println! ");
        System.out.println("System.out.println! ");
        System.out.println("System.out.println! ");*/
        
        int y; // Declaration
        y = 9; // Initialization
        int x = 100; // Declaration cum initialization

        // Printing a simple integer
        System.out.printf("Printing simple integer: x = %d%n", x);

        // Printing a floating-point number with precision
        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float n = 5.245324567f;

        // Formatting a float to 4 decimal places
        System.out.printf("Formatted float: %.4f%n", n);

        // Using System.out.print twice
        System.out.print("This is a print statement. ");
        System.out.print("Another print statement.\n");

        // Using System.out.println three times
        System.out.println("This is a println statement.");
        System.out.println("Another println statement.");
        System.out.println("Yet another println statement.");

        // Using System.err.println twice
        System.err.println("This is an error message!");
        System.err.println("Another error message!");
    }
} // <-- This closing brace was missing


