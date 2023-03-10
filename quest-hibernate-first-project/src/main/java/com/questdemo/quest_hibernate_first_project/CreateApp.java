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
public class CreateApp {
	public static void main( String[] args ) {


		//create the session factory 
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
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