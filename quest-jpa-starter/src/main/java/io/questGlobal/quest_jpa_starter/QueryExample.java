package io.questGlobal.quest_jpa_starter;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class QueryExample {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("myApp");
		EntityManager em = emf.createEntityManager();

		//get all records
		//		TypedQuery<Employee> query = em.createQuery("select e from Employee e",Employee.class);
		//employee-> class name, not the table name

		// condition: where age >25
//		TypedQuery<Employee> query = em.createQuery("select e from Employee e where age > 25 order by e.age ",Employee.class);

	 TypedQuery<Employee> query = em.createNamedQuery("emp name asc",Employee.class);
	 query.setParameter("age", 25);
		  List<Employee> resultList = query.getResultList();
		resultList.forEach(System.out::println);
		emf.close();
		em.close();

	}
}
