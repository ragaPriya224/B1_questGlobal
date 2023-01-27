package com.questdemo.quest_hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.questdemo.quest_hibernate_first_project.entity.Song;
import com.questdemo.quest_hibernate_first_project.utility.HibernateUtils;

public class DeleteApp {
	public static void main( String[] args ) {
		
		

		//create the configuration
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//sf = data source  -> ds???

//		sessionFactory.set -> immutable 
		//initialize the session object 
		Session session = sessionFactory.openSession(); //initialized it as null
		
		session.beginTransaction();
		//load the object , to be deleted
		
		Song song=session.get(Song.class, 1);
		session.delete(song);
		
		session.getTransaction().commit();
		System.out.println(" song saved , check db ");
		session.close();
	}


}
