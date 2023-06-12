package ru.sevastopall.spring_education.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.one_to_one.entity.Employee;
import ru.sevastopall.spring_education.hibernate.one_to_one.entity.Detail;

public class Main6 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            Employee employee = new Employee("Vsevolod", "Ivanov", "IT", 500);
            Detail detail = new Detail("Balakovo", "88005555", "Vse@as");
            employee.setDetail(detail);
            session.beginTransaction();

            session.getTransaction().commit();
        }
    }
}
