package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;

/**
 * Hello world!
 *
 */
public class ReadApp {
	public static void main( String[] args ) {

		// get data of id 2
		
		//create the configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		//				configuration.addAnnotatedClass(Song.class);
		//create the session factory 
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Song song=session.load(Song.class, 3);
		System.out.println(song);

	}
}
