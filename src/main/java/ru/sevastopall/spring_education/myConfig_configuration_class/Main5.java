package ru.sevastopall.spring_education.myConfig_configuration_class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        }
    }
}
