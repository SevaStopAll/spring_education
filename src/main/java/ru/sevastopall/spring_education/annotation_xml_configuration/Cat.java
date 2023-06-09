package ru.sevastopall.spring_education.annotation_xml_configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sevastopall.spring_education.IoC.Pet;

@Component("catBean")
@Scope("prototype")
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
