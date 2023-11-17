package org.example.dependencyInjection.setterInjection.primitive;

public class Student {
    private int studentRollNumber;
    private String studentName;
    private String studentCourse;

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Student(int studentRollNumber, String studentName, String studentCourse) {
        super();
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRollNumber=" + studentRollNumber +
                ", studentName='" + studentName + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                '}';
    }
}
