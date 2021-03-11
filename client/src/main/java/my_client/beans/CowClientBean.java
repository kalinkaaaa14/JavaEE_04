package my_client.beans;

import library.CowAnimal;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnBean(CowAnimal.class)
public class CowClientBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cow bean is created...");
    }
}
