package ru.sevastopall.spring_education.annotation_xml_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")) {
            Person person = context.getBean("personBean", Person.class);
            person.callYourPet();
            System.out.println(person.getAge());
            System.out.println(person.getSurname());
        }
    }
}
