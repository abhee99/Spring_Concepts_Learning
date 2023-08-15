package l10.referenceInject;

public class Student {
    Person person;
    int rollno;
    public Student() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", rollno=" + rollno +
                '}';
    }
}

