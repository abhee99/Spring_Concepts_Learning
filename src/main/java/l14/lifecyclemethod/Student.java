package l14.lifecyclemethod;

public class Student {
    int rollno;
    String name;

    public Student() {
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        System.out.println("STUDENT CLASS : Setting roll no,");
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("STUDENT CLASS : Setting name");
        this.name = name;
    }
    public void init() {
        System.out.println("STUDENT CLASS : Running INIT");
    }
    public void destroy() {
        System.out.println("STUDENT CLASS : Running DESTROY");

    }
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
