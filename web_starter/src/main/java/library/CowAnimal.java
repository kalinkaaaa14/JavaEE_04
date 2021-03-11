package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="animal.type", havingValue="cow_type")
public class CowAnimal implements Animal, InitializingBean {
    private String name = "Milka";
    private int age = 5;
    private String food = "grass";
    private String voice = "muu";

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
        return "speaks:" +voice;
    }

    @Override
    public String eat() {
        return "eats:"+food;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cow " + getName() + " is " + getAge() +". It "+ speak() + " and " + eat());
    }
}
