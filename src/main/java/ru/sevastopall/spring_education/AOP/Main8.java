package ru.sevastopall.spring_education.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            System.out.println("Method main starts");
            UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
            String bookName = library.returnBook();
            System.out.println(bookName);
        }
        System.out.println("Method main ends");
    }
}
