package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;
import com.questdemo.quest_hibernate_first_project.utility.HibernateUtils;

/**
 * Hello world!
 *
 */
public class ReadApp {
	public static void main( String[] args ) {

		// get data of id 2
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		Song song=session.load(Song.class, 3);
		System.out.println(song);

	}

}
