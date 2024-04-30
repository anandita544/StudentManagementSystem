public class StudentSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("John Doe", 20, "S001");
        Student student2 = new Student("Alice Smith", 22, "S002");

        // Create teacher
        Teacher teacher1 = new Teacher("Professor Johnson", 35, "T001");

        // Create courses
        Course mathCourse = new Course("Mathematics");
        Course physicsCourse = new Course("Physics");
        Course programmingCourse = new Course("Programming");

        // Enroll students
        student1.enroll(mathCourse);
        student1.enroll(programmingCourse);
        student2.enroll(physicsCourse);

        // Assign courses to teacher
        teacher1.assignCourse(mathCourse);
        teacher1.assignCourse(physicsCourse);

        // Display information
        System.out.println("Student Information:");
        student1.display();
        student2.display();

        System.out.println("\nTeacher Information:");
        teacher1.display();
    }
}
