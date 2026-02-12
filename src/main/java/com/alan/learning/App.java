package com.alan.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args)  {


        laptop l = new laptop();
        l.setId(3);
        l.setLapname("Dell");

        student studs = new student();
        studs.setRoll(3);
        studs.setName("Roni");
        studs.setMarks(89);
        studs.setL(l);

        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(laptop.class);

        try (SessionFactory sf = con.buildSessionFactory(); 
        Session session = sf.openSession()) {
            
            Transaction tx = session.beginTransaction();
            
            session.persist(l);
            session.persist(studs);
            
            tx.commit();
        }
        
    }
}
