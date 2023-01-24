package io.questGlobal.quest_jpa_starter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterWriter {

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



		PayStub p1= new PayStub();
		p1.setPayPeriodEnd(new Date());
		p1.setPayPeriodStart(new Date());
		p1.setSalary(10000);

		PayStub p2= new PayStub();
		p2.setPayPeriodEnd(new Date());
		p2.setPayPeriodStart(new Date());
		p2.setSalary(2000);


		p1.setE(e);
		p2.setE(e2);
		
		List<PayStub> payStubList=new ArrayList();
		payStubList.add(p1);
		payStubList.add(p2);
		e.setPaystub(payStubList);
//		e.addPayStub(p1);
		
		EmailGroup g1 = new EmailGroup();
		g1.setName("company group discussions");
				
		EmailGroup g2 = new EmailGroup();
		g2.setName("engineering project");
		
		
		g1.addMember(e);
		g1.addMember(e2);
		
		e.addEmailSubscription(g1);
		e.addEmailSubscription(g2);
		e2.addEmailSubscription(g1);
		g2.addMember(e);
		
		EntityTransaction t = em.getTransaction();//gives me the transaction instance
		t.begin();
		em.persist(e);
		em.persist(e2);
		
		em.persist(card1);
		em.persist(card2);

		em.persist(p1);
		em.persist(p2);
		
		em.persist(g1);
		em.persist(g2);
		//		em.remove(e);
		t.commit();
		em.close();
		emf.close();

	}

}
