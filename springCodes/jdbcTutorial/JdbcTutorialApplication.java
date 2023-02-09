package com.example22.jdbcTutorial;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example22.jdbcTutorial.dao.DAO;
import com.example22.jdbcTutorial.model.Course;

@SpringBootApplication
public class JdbcTutorialApplication {
	 private static DAO<Course> dao;

	    public JdbcTutorialApplication(DAO<Course> dao) {
	        this.dao = dao;
	    }

	public static void main(String[] args) {
		SpringApplication.run(JdbcTutorialApplication.class, args);
		
//		System.out.println("\nOne Course -------------------------------------\n");
//        Optional<Course> course = dao.get(1);
//        System.out.println(course.get());
//
//        System.out.println("\nCreate Course -------------------------------------\n");
//        Course springVue = new Course("Spring Boot + Vue","New Course","hello team ");
//        dao.create(springVue);
//
//        springVue.setDescription("updated");
//        dao.update(springVue,2);
//
//        dao.delete(4);
//
//        System.out.println("\nAll Courses -------------------------------------\n");
//        List<Course> courses = dao.list();
//        courses.forEach(System.out::println);
        
//        System.out.println("************************");
//        System.out.println(dao.getByTitleTemplate());
//        System.out.println("************************");
//        System.out.println(dao.getByTitleMap());
        System.out.println("---------------------------");
       dao.m2();
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       List<Course> resultList = dao.getAllCourses();
       System.out.println(resultList.size());
       resultList.forEach(System.out::println);
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
