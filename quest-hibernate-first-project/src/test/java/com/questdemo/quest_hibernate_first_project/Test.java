package com.questdemo.quest_hibernate_first_project;

import org.hibernate.SessionFactory;

import com.questdemo.quest_hibernate_first_project.utility.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
		if(sessionFactory == sessionFactory1) {
			System.out.println("both objects are same ");
		}
		System.out.println(sessionFactory + "  " +sessionFactory1);


	}

}
