package ru.sevastopall.spring_education.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.entity.Employee;

import java.util.List;

public class Main4 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
/*            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(1500);*/
            session.createQuery("update Employee set salary = 1000 where name = 'Oleg'").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
