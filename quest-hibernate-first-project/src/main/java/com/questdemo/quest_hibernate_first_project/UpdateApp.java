package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;
import com.questdemo.quest_hibernate_first_project.utility.HibernateUtils;

/**
 * Hello world!
 *
 */
public class UpdateApp {
	public static void main( String[] args ) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

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
