import java.util.*;
class Student extends Person {
    private List<Course> courses;

    // Constructor
    public Student(String name, int age, String id) {
        super(name, age, id);
        courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enroll(Course course) {
        courses.add(course);
    }

    // Method to display student information
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + id);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}
