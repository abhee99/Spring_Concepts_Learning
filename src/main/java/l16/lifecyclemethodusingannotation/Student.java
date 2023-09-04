package l16.lifecyclemethodusingannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    int rollno;
    String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("STUDENT CLASS : Running INIT");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("STUDENT CLASS : Running Destroy");
    }
}
