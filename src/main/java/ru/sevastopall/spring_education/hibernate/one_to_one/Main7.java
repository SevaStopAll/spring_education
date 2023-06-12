package ru.sevastopall.spring_education.hibernate.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.one_to_one.entity.Employee;
import ru.sevastopall.spring_education.hibernate.one_to_one.entity.Detail;

public class Main7 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {

/*            Employee employee = new Employee("Misha", "Sidorov", "HR", 860);
            Detail detail = new Detail("Salakovo", "5555", "ssse@as");
            employee.setDetail(detail);
            detail.setEmployee(employee);*/

            session.beginTransaction();

            /*session.save(detail);*/

            session.getTransaction().commit();
        }
    }
}
