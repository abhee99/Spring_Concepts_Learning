package l5.basics;

import java.util.List;

// THIS IS A BEAN. WE WONT CREATE OBJECT OF THIS ON OUR OWN, WE WILL ASK SPRING CONTAINER TO DO IT FOR US.
public class Student {
    private int studentId;

    List<String> friends;
    private String studentName;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", friends=" + friends +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
        super();
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


}
