import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    

    ArrayList<Student> a = new ArrayList<>();

    Student s1=new Student(1,"Naveen", "naveenkolla630@gmail.com");
    Student s2=new Student(2,"Kavya" ,"naeenkolla630@gmail.com");
    Student s3=new Student(3,"Navya", "veenkolla630@gmail.com");

    a.add(s1);
    a.add(s2);
    a.add(s3);

    System.out.println("Lol Yu are entering details here: ");
    System.out.println("Enter Student ID:");
    int x = sc.nextInt();
    System.out.println("Enter your name :");
    String y = sc.next();
    System.out.println("Enter your email :");
    String z = sc.next();

    System.out.println("\n\n");
    Student p = new Student(x,y,z);

    a.add(p);

    
    
    System.out.println("The details are as follows: \n");
    for(Student s:a){
        s.display();
    }
    
    
    }
}