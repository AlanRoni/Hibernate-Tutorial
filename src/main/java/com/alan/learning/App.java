package com.alan.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args)  {

        Alien a = null;
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        try (SessionFactory sf = con.buildSessionFactory(); 
        Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();

            a =(Alien) session.find(Alien.class, 101);
             
            tx.commit();
        }
        
    }
}
