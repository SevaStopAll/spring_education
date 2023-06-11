package ru.sevastopall.spring_education.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.entity.Employee;

public class Main {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Vsevolod", "Ivanov", "IT", 500);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}
