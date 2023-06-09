package ru.sevastopall.spring_education.myConfig_configuration_class;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sevastopall.spring_education.IoC.Pet;

@Component("catBean")
@Scope("singleton")
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
