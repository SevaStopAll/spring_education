package ru.sevastopall.spring_education.DI;

import ru.sevastopall.spring_education.IoC.Pet;

public class Person {

 /*   private Pet pet;
    public Person(Pet pet) {
        this.pet = pet;
    }
*/

    private Pet pet;

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

    private String surname;
    private int age;
    public Person() {}

    public void setPet(Pet pet) {
        System.out.println("Class Person : set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

}
