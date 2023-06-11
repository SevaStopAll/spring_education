package ru.sevastopall.spring_education.AOP;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из Универской библиотеки ");
        System.out.println("----------------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу");
        System.out.println("----------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал");
        System.out.println("----------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал");
        System.out.println("----------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу");
        System.out.println("----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал");
        System.out.println("----------------------------------------");
    }


}
