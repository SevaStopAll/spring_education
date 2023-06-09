package ru.sevastopall.spring_education.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    /*@Pointcut("execution(* ru.sevastopall.spring_education.AOP.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(public void ru.sevastopall.spring_education.AOP.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("Log # 10");
    }
*/

    /*@Pointcut("execution (* ru.sevastopall.spring_education.AOP.UniLibrary.get*())")
        private void allGetMethodsFromUniLibrary() {}

    @Pointcut("execution (* ru.sevastopall.spring_education.AOP.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLogginAdvice() {
        System.out.println("beforeAllGetAndReturnLogginAdvice: writing Log #3");
    }*/

    @Before("ru.sevastopall.spring_education.AOP.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookLogging: попытка получить книгу");
    }




}
