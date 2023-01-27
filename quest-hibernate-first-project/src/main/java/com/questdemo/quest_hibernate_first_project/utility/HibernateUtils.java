package com.questdemo.quest_hibernate_first_project.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);
			 sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}
