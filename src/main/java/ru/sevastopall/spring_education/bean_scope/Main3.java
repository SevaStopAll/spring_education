package ru.sevastopall.spring_education.bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sevastopall.spring_education.IoC.Dog;

public class Main3 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            Dog dog = context.getBean("myPet", Dog.class);
            Dog dog2 = context.getBean("myPet", Dog.class);
            System.out.println(dog == dog2);
        }
    }

}
