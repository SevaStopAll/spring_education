package ru.sevastopall.spring_education.AOP;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из Универской библиотеки ");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал");
    }


}
