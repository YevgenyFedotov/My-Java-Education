package Course;

import java.util.Arrays;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents = 0;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] allStudent = new String[numberOfStudents];
        for (int i = 0 ; i < numberOfStudents ; i ++){
            allStudent[i] = this.students[i];
        }
        return allStudent;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student){
        this.numberOfStudents++;
        if (this.students.length == numberOfStudents){
            String[] newStudents = new String[(int)(this.students.length * 1.1)];
            for (int i = 0 ; i < this.students.length ; i ++){
                newStudents[i] = this.students[i];
            }
            newStudents[numberOfStudents - 1] = student;
            this.students = newStudents;
            return;
        }
        this.students[numberOfStudents - 1] = student;
    }

    public void dropStudent(String student){
        for ( int i = 0 ; i < this.numberOfStudents ; i ++){
            if ( this.students[i].equals(student) ){
                this.students[i] = null;
                this.numberOfStudents--;
                this.sortStudent();
                return;
            }
        }
        System.out.println("Студент не найден");
    }

    public void clear(){
        this.numberOfStudents = 0;
        this.students = new String[10];
    }

    public void printStudents(){
        for (int i = 0 ; i < this.numberOfStudents ; i++){
            System.out.println((i+1) + ". " + this.students[i]);
        }
    }

    public void sortStudent(){
        String temp;
        do {
            temp = null;
            for ( int i = 0 ; i < students.length - 1 ; i++){
                if (students[i] == null){
                    temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
                else if (students[i+1] != null && students[i].compareTo(students[i+1]) > 0){
                    temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }while (temp != null);
    }
    @Override
    public Course clone(){
        Course newCourse = null;
        try {
            newCourse = (Course)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        newCourse.students = this.students.clone();
        return newCourse;
    }
}
