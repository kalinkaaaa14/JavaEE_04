package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="animal.type", havingValue="dog_type")
public class DogAnimal implements Animal, InitializingBean {
    private String name = "Sharik";
    private int age = 2;
    private String food = "meat";
    private String voice = "woaf";

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

    public void afterPropertiesSet() throws Exception {
        System.out.println("Dog " + getName() + " is " + getAge()  +". It "+ speak() + " and " + eat());
    }
}
