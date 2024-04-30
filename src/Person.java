import java.util.*;
abstract class Person {
    protected String name;
    protected int age;
    protected String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Abstract method for displaying person's information
    abstract void display();
}
