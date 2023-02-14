package com.questGlobal.testing001.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.questGlobal.testing001.model.Course;

public interface CourseService {
	List<Course> getAllCourses();
	void saveCourse(Course course);
	Course getCourseById(long id);
	void deleteCourseById(long id);
	Page<Course> findPaginated(int pageNum, int pageSize,
							String sortField,
							String sortDirection);
}
