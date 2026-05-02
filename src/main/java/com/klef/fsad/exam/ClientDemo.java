package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class ClientDemo
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Course c = new Course(
                "DBMS",
                "Database",
                LocalDate.of(2024,6,1),
                "Active",
                60,
                "Bharathi",
                4
        );

        session.save(c);

        tx.commit();

        System.out.println("Record Inserted Successfully");

        session.close();
        sf.close();
    }
}