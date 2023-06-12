package ru.sevastopall.spring_education.hibernate.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.sevastopall.spring_education.hibernate.many_to_many.entity.*;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            Section section1 = new Section("Football");
            Child child1 = new Child("Vsevolod", 5);
            Child child2 = new Child("Masha", 5);
            Child child3 = new Child("Vladik", 4);
            section1.addChild(child1);
            section1.addChild(child2);
            section1.addChild(child3);
            session.beginTransaction();

            session.persist(section1);


            session.getTransaction().commit();
        }
    }
}
