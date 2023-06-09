package ru.sevastopall.spring_education.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* get*())")
    /*("execution(public void getBook())")*/
    public void allGetMethods(){}
}
