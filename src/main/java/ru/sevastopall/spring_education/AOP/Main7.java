package ru.sevastopall.spring_education.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main7 {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            University university = context.getBean("university", University.class);
            university.addStudents();
            try {
                List<Student> students = university.getStudents();
                System.out.println(students);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Было поймано исключение" + e);
            }
        }
    }
}
