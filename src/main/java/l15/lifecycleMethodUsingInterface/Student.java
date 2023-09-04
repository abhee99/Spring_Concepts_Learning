package l15.lifecycleMethodUsingInterface;

public class Student {
    String name;
    int rollno;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
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
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }


}
