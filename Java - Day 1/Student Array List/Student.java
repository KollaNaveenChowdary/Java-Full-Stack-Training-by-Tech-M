

public class Student {
    String name;
    int id;
    String email;

    public Student(int a, String b, String c){
        id = a;
        name = b;
        email = c;
    }

    void display(){
        System.out.println("roll number: "+id);
        System.out.println("Name :"+name);
        System.out.println("email"+email);
    } 
}


