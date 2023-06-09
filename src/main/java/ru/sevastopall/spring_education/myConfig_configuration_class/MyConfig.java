package ru.sevastopall.spring_education.myConfig_configuration_class;

import org.springframework.context.annotation.*;
import ru.sevastopall.spring_education.IoC.Cat;
import ru.sevastopall.spring_education.IoC.Pet;

@Configuration
@ComponentScan("ru.sevastopall.spring_education.myConfig_configuration_class")
@PropertySource("classpath:application.properties")
public class MyConfig {
/*    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }*/
}
