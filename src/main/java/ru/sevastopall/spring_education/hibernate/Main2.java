package ru.sevastopall.spring_education.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.entity.Employee;

public class Main2 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidorov", "HR", 700);
            session.beginTransaction();
            session.save(employee);
            int myId = employee.getId();
            Employee employee2 = session.get(Employee.class, myId);
            System.out.println(employee2.getName());
            session.getTransaction().commit();
        }
    }
}
