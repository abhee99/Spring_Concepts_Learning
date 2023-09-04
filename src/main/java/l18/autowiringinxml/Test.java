package l18.autowiringinxml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("l18.autowiringinxml.xml");
        Student st = ac.getBean("student1", Student.class);
        System.out.println(st);
    }
}
