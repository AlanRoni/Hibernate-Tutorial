package com.alan.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args)  {

        AlienName an = new AlienName();
        an.setFname("Alan");
        an.setMname("Roni");
        an.setLname("Mathew");

        Alien mars = new Alien();
        mars.setAid(112);
        mars.setAname(an);
        mars.setColor("Blue");


        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        try (SessionFactory sf = con.buildSessionFactory(); 
        Session session = sf.openSession()) {
            
            Transaction tx = session.beginTransaction();
            
            session.persist(mars);
            
            tx.commit();
        }
        System.out.println(mars);
        
    }
}
