package io.questGlobal.quest_jpa_starter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterRead {

	public static void main(String[] args) {
		System.out.println("hellow");		//creating entity manager factory
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
		EntityManager em = emf.createEntityManager();
		PayStub paystub = em.find(PayStub.class, 5);
//		System.out.println(paystub.getE());
		System.out.println("********************");
		Employee e = em.find(Employee.class, 1);
//		System.out.println(e.getPaystub());

		//				
		//		
		//				 System.out.println(e.getName());
		//				 System.out.println("**");
		//				 System.out.println(e.getCard());

		//		AccessCard card = em.find(AccessCard.class, 3);
		//System.out.println(card.getOwner());

		EntityTransaction t = em.getTransaction();//gives me the transaction instance
		t.begin();


		em.close();
		emf.close();

	}

}
