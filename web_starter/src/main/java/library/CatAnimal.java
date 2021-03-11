package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value="animal.type", havingValue="cat_type")
public class CatAnimal implements Animal, InitializingBean {
    private String name = "Berta";
    private int age = 4;
    private String food = "sausages";
    private String voice = "meowww";

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
        System.out.println("Cat " + getName() + " is " + getAge() +". It "+ speak() + " and " + eat());
    }
}
