package io.questGlobal.quest_jpa_starter;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterMain {

	public static void main(String[] args) {
		System.out.println("hellow");		//creating entity manager factory
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
		EntityManager em = emf.createEntityManager();

		Employee e = new Employee();
		//		e.setId(1);
		e.setName("abc");
		e.setAge(20);
		e.setDob(new Date());
		//		e.setType(EmployeeType.FULL_TIME);
		Employee e2 = new Employee();
		//		e.setId(1);
		e2.setName("cdef");
		e2.setAge(40);
		e2.setDob(new Date());
		//		e.setType(EmployeeType.FULL_TIME);

		AccessCard card1 = new AccessCard();
		card1.setIssuedDate(new Date());
		card1.setActive(true);
		card1.setFirmwareVersion("1.0.1");
//		card1.setId(110);
		
		AccessCard card2 = new AccessCard();
		card2.setIssuedDate(new Date());
		card2.setActive(false);
		card2.setFirmwareVersion("2.0.4");
//		card2.setId(20);

//		e.setAccessCardId(card1.getId());
//		e2.setAccessCardId(card2.getId());
		e.setCard(card1);
		e2.setCard(card2);
		
		card1.setOwner(e);//cyclical relationship
		card2.setOwner(e2);
		
		System.out.println("******");
		
		System.out.println(card1.getOwner());
		//		 Employee e = em.find(Employee.class, 1);
		////		 e.setAge(44);
		//		 System.out.println(e);
		//		 em.get

		//		 Employee e2 = em.find(Employee.class, 2);
		//		 System.out.println(e2);
		//		 
		//		 Employee e3 = em.find(Employee.class, 44);
		//		 System.out.println(e3);

		EntityTransaction t = em.getTransaction();//gives me the transaction instance
		t.begin();
		em.persist(e);
		em.persist(e2);
		em.persist(card1);
		em.persist(card2);
		//		em.remove(e);
		t.commit();
		em.close();
		emf.close();

	}

}
