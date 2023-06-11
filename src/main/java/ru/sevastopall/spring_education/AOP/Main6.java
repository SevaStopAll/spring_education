package ru.sevastopall.spring_education.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            Book book = context.getBean("book", Book.class);
            UniLibrary library =  context.getBean("uniLibrary", UniLibrary.class);
            library.getBook();
            library.addBook("Vsevolod", book);
            library.addMagazine();
        }
    }
}
