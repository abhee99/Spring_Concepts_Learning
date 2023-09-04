package l16.lifecyclemethodusingannotation;

import l16.lifecyclemethodusingannotation.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("l16.lifecyclemethodusingannotation.xml");
        Student st = (Student) ac.getBean("student1");
        System.out.println(st);
        ac.registerShutdownHook();
    }
}
