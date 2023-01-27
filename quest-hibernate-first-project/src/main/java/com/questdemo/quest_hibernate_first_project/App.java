package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
       //create the configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Song.class);
    	
    	//create the session factory 
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	//sf = data source  -> ds???
    	
    	
    	//initialize the session object 
    	Session session = sessionFactory.openSession(); //initialized it as null
    	
    	
    	session.beginTransaction();
    	Song song1 = new Song();
    	song1.setId(2);
    	song1.setSongName("abc");
    	song1.setArtist("aaaaaa");
    	
    	session.save(song1);
    	session.getTransaction().commit();
    	System.out.println(" song saved , check db ");
    }
}
