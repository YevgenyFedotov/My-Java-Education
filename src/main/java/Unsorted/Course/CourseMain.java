package Unsorted.Course;

public class CourseMain {
    public static void main(String[] args) {
        Course course1 = new Course("Math");
        course1.addStudent("1");
        course1.addStudent("2");
        course1.addStudent("3");
        course1.addStudent("4");
        course1.addStudent("5");

        course1.printStudents();
        Course course2 = course1.clone();
        course2.printStudents();

        course2.dropStudent("2");
        course1.printStudents();

    }
}
