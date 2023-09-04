package l15.lifecycleMethodUsingInterface;

import l15.lifecycleMethodUsingInterface.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("l15.lifecycleMethodUsingInterface.xml");
//        Student st = ac.getBean("student1", Student.class);
//        System.out.println(st);
        Pepsi ps = ac.getBean("pepsi1", Pepsi.class);
        System.out.println(ps);
        // to run destroy method
        // registerShutdownHook() is available in AbstractApplicationContext
        ac.registerShutdownHook();
    }
}
