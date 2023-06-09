package ru.sevastopall.spring_education.IoC;

public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
