package ru.sevastopall.spring_education.AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Vsevolod Ivanov", 4, 7.5);
        Student st2 = new Student("Michail Ivanov", 3, 8.4);
        Student st3 = new Student("Marina Krasnova", 1, 9.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }


}