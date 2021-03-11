package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AnimalConfig.class)
public class AnimalConfig {
    @Bean
    @ConditionalOnProperty(value = "animal.type", havingValue = "cat_type")
    Animal cat() {
        return new CatAnimal();
    }

    @Bean
    @ConditionalOnProperty(value = "animal.type", havingValue = "cow_type")
    Animal cow() {
        return new CowAnimal();
    }

    @Bean
    @ConditionalOnProperty(value = "animal.type", havingValue = "dog_type")
    Animal dog() {
        return new DogAnimal();
    }

    @Bean
    @ConditionalOnProperty(value = "animal.type", havingValue = "pony_type")
    Animal horse() {
        return new PonyAnimal();
    }
}
