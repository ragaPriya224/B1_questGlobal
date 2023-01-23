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
		e.setId(1);
		e.setName("abc");
		e.setAge(20);
		e.setDob(new Date());
	e.setType(EmployeeType.FULL_TIME);
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("alien");
		e2.setAge(30);
		e2.setType(EmployeeType.CONTRACT);
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("coder");
		e3.setAge(40);
		
		e.setSsn("123");
		e2.setSsn("456");
		EntityTransaction t = em.getTransaction();//gives me the transaction instance
		t.begin();
		em.persist(e);
		em.persist(e2);
		em.persist(e3);
		t.commit();
		

	}

}
