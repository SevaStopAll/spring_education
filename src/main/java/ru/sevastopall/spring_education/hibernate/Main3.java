package ru.sevastopall.spring_education.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.entity.Employee;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
/*            List<Employee> employees = session.createQuery("from Employee")
                            .getResultList();*/
            List<Employee> employees = session.createQuery("from Employee where name = 'Oleg' AND salary > 200")
                    .getResultList();
            for (Employee e: employees) {
                System.out.println(e);
            }
            session.getTransaction().commit();
        }
    }
}
