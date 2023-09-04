package l15.lifecycleMethodUsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    int price;
    String color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pepsi class : RUNNING DESTROY");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pepsi class : RUNNING INIT");
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
