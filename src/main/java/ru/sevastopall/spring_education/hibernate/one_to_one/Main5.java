package ru.sevastopall.spring_education.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.one_to_many_bi.entity.Employee;

public class Main5 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
/*            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);*/
            session.createQuery("delete Employee where name = 'Oleg'").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
