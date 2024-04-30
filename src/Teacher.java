import java.util.*;
class Teacher extends Person {
    private List<Course> courses;

    // Constructor
    public Teacher(String name, int age, String id) {
        super(name, age, id);
        courses = new ArrayList<>();
    }

    // Method to assign a course
    public void assignCourse(Course course) {
        courses.add(course);
    }

    // Method to display teacher information
    public void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Age: " + age);
        System.out.println("Teacher ID: " + id);
        System.out.println("Teaching Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}
