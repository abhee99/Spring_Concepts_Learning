package l5.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("l5_basics.xml");
        Student st = (Student) ac.getBean("student1");
        Student st1 = ac.getBean("student2", Student.class);
        System.out.println(st);
        System.out.println(st1);
    }
}
