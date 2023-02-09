package com.example22.jdbcTutorial.dao;

import java.util.List;
import java.util.Optional;

import com.example22.jdbcTutorial.model.Course;

public interface DAO<T> {
//    List<T> list();
//
//    void create(T t);
//
//    Optional<T> get(int id);
//
//    void update(T t, int id);
//
//    void delete(int id);
    String getByTitleTemplate();

	Integer getByTitleMap();
	
	void m2();

	List<Course> getAllCourses();
}
