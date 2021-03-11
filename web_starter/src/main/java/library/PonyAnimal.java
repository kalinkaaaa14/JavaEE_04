package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="animal.type", havingValue="pony_type")
public class PonyAnimal implements Animal, InitializingBean {
    private String name = "Hor";
    private int age = 6;
    private String food = "oat";
    private String voice = "igogo";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String speak() {
        return "speaks:"+voice;
    }

    @Override
    public String eat() {
        return "eats:"+food;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pony " + getName() + " is " + getAge() +". It "+ speak() + " and " + eat());
    }
}
