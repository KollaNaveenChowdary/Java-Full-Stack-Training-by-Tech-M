// User.java
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

// SecondUser.java
public class SecondUser {
    private String name;
    private int age;

    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", 25);
        User user2 = new User("John", 25);
        SecondUser secondUser1 = new SecondUser("John", 25);
        SecondUser secondUser2 = new SecondUser("John", 25);

        System.out.println(user1.toString());
        System.out.println(user1.equals(user2));
        System.out.println(secondUser1.equals(secondUser2));
    }
}