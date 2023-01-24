package io.questGlobal.quest_jpa_starter;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterWriter {

	public static void main(String[] args) {
		System.out.println("hellow");		//creating entity manager factory
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
		EntityManager em = emf.createEntityManager();

	
//				 Employee e = em.find(Employee.class, 1);
//		
//				 System.out.println(e.getName());
//				 System.out.println("**");
//				 System.out.println(e.getCard());
		
		AccessCard card = em.find(AccessCard.class, 3);
System.out.println(card.getOwner());

		EntityTransaction t = em.getTransaction();//gives me the transaction instance
		t.begin();
//		em.persist(e);
//		em.persist(e2);
//		em.persist(card1);
//		em.persist(card2);
//		//		em.remove(e);
//		t.commit();
		em.close();
		emf.close();

	}

}
