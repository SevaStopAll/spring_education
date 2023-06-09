package ru.sevastopall.spring_education.annotation_xml_configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sevastopall.spring_education.IoC.Pet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {
/*    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
    @PostConstruct
    public void init() {
        System.out.println("Init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method");
    }


    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
