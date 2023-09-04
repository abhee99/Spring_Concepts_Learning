package l19.autowireannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("l19.autowireannotation.xml");
        Student st = (Student) ac.getBean("student1");
        System.out.println(st);
    }
}
