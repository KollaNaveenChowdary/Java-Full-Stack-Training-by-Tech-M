import java.io.*;

// Employee class implementing Serializable
class Employee implements Serializable {
    int Eno;
    String Ename;
    transient String email;  // 'transient' ensures this field is not serialized

    Employee(int Eno, String Ename, String email) {
        this.Eno = Eno;
        this.Ename = Ename;
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        String filename = "employee.ser";  // File to store serialized object

        // Serialization: Writing object to file
        try {
            Employee emp = new Employee(101, "Banu Manoharan", "banu@example.com");
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(emp);
            out.close();
            fout.close();

            System.out.println("Serialization Success!");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e);
        }

        // Deserialization: Reading object from file
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            Employee emp = (Employee) in.readObject();
            in.close();

            System.out.println("\nDeserialized Employee:");
            System.out.println("Eno: " + emp.Eno);
            System.out.println("Ename: " + emp.Ename);
            System.out.println("Email: " + emp.email); // Expected output: null (due to transient)
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e);
        }
    }
}


