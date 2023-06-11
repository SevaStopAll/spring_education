package ru.sevastopall.spring_education.AOP.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.sevastopall.spring_education.AOP.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("Логируем получение списка студентов перед методом getStudents");
    }


    /*@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = " Mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double averageGrade = firstStudent.getAverageGrade();
        averageGrade = averageGrade + 1;
        firstStudent.setAverageGrade(averageGrade);

        System.out.println("Логируем получение списка студентов после метода getStudents");
    }*/

    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentsLoggingAdvice: логируем выброс исключения " + exception);

    }
}
