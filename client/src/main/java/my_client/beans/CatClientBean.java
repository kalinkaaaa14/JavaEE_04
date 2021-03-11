package my_client.beans;

import library.CatAnimal;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(CatAnimal.class)
public class CatClientBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat bean is created...");
    }
}
