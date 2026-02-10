package com.alan.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien mars = new Alien();
        mars.setAid(101);
        mars.setAname("Alan");
        mars.setColor("Green");


        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.
    }
}
