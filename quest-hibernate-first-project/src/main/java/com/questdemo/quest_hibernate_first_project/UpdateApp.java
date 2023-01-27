package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;

/**
 * Hello world!
 *
 */
public class UpdateApp {
	public static void main( String[] args ) {

		//change song name of id 1  to upper case
		//create the configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		//				configuration.addAnnotatedClass(Song.class);
		//create the session factory 
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();


		session.beginTransaction();
		
//		Song song1 = new Song(); // problem updating, other fields as null
		Song song1 = session.get(Song.class, 2);
//		song1.setId(1);
		song1.setSongName("zzzzz");

		session.update(song1);
		session.getTransaction().commit();

		session.close();

	}
}
