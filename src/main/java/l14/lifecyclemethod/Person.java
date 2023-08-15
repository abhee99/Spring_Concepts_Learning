package l14.lifecyclemethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {
    String name;
    String location;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("PERSON CLASS : Setting name");
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        System.out.println("PERSON CLASS : Setting location");
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // init work
        System.out.println("PERSON CLASS : Initialization code");
    }

    @Override
    public void destroy() throws Exception {
        // destroy work
        System.out.println("PERSON CLASS : Inside Destroy");
    }
}
