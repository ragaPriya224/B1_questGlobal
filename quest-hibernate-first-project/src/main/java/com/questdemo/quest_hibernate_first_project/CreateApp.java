package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;

/**
 * Hello world!
 *
 */
public class CreateApp {
	public static void main( String[] args ) {

		//create the configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);
		
//		configuration.addAnnotatedClass(Song.class);
		//create the session factory 
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//sf = data source  -> ds???

//		sessionFactory.set -> immutable 
		//initialize the session object 
		Session session = sessionFactory.openSession(); //initialized it as null


		session.beginTransaction();
		Song song1 = new Song();
		song1.setId(4);
		song1.setSongName("nattu");
		song1.setArtist("RRR");

		session.save(song1);
		session.getTransaction().commit();
		System.out.println(" song saved , check db ");
		session.close();

		
	}
}
//session -> short lived
// sF -> long lived for entired application

//only 1 sf -> create
//session object -> create many 