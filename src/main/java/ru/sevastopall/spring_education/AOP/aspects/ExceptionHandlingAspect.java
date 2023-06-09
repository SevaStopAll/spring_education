package ru.sevastopall.spring_education.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("ru.sevastopall.spring_education.AOP.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("BeforeExceptionHandlingAdvice ловим/обрабатываем исключения при попытке получить книгу или журнал");
    }
}
