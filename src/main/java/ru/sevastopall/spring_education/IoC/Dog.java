package ru.sevastopall.spring_education.IoC;

public class Dog implements Pet {
/*    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public void init() {
        System.out.println("Init method");
    }

    public void destroy() {
        System.out.println("Destroy method");
    }


    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
