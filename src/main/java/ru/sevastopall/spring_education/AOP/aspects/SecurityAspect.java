package ru.sevastopall.spring_education.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("ru.sevastopall.spring_education.AOP.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetBookSecurity Проверка прав на получение книги");
    }
}
