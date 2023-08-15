package l10.referenceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
        public static void main( String[] args )
        {
            ApplicationContext ac = new ClassPathXmlApplicationContext("l10.referenceInject.xml");
            Student st = (Student) ac.getBean("student1");
            System.out.println(st);
        }
    }
