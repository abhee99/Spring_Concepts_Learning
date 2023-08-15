package l14.lifecyclemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("l14.lifecyclemethod.xml");
        Student st = ac.getBean("student1", Student.class);
        Person ps = ac.getBean("person1", Person.class);
        System.out.println(st);
        System.out.println(ps);
        // to run destroy method
        // registerShutdownHook() is available in AbstractApplicationContext
        ac.registerShutdownHook();
    }
}
