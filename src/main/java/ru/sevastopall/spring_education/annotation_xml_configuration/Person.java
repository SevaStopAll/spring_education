package ru.sevastopall.spring_education.annotation_xml_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.sevastopall.spring_education.IoC.Pet;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    /*@Value("${person.surname}")*/
    private String surname;
    /*@Value("${person.age}")*/
    private int age;

    /*public Person() {}*/

/*    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*@Autowired*/
    public void setPet(Pet pet) {
        System.out.println("Class Person : set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

}
