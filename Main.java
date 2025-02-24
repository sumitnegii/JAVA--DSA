
// Parent class
class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class inheriting from Human
public class Main extends Human {

    // Constructor for Main class
    Main(int age, String name) {
        super(age, name); // Calls the constructor of Human
    }

    public static void main(String[] args) {
        Main m1 = new Main(30, "Raj");
        m1.display(); // Inherited method
        // Human h1 =  new Human(12,"sumit");
        // h1.display();
    }
}
