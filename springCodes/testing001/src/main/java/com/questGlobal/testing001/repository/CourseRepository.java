package com.questGlobal.testing001.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questGlobal.testing001.model.Course;
 
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
 
}