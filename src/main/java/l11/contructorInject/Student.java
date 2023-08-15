package l11.contructorInject;

public class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        System.out.println("Inside Constructor");
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
