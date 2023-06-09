package ru.sevastopall.spring_education.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Pet pet = context.getBean("myPet", Pet.class);
            pet.say();
        }
    }
}
