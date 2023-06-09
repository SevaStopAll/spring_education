package ru.sevastopall.spring_education.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.sevastopall.spring_education.AOP")
@EnableAspectJAutoProxy
public class MyConfig {

}
