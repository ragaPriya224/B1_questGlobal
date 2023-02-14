
package com.questGlobal.testing001.controller; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.questGlobal.testing001.model.Course;
import com.questGlobal.testing001.service.CourseService;

import jakarta.validation.Valid;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1, "courseName", "asc", model);
	}

	@GetMapping("/add")
	public String showNewCourseForm(Model model) {
		Course Course = new Course();
		model.addAttribute("course", Course);
		return "new_course";
	}

	@PostMapping("/save")
	public String saveCourse(@Valid @ModelAttribute("course") Course course,BindingResult result) {
		// save Course to database
		courseService.saveCourse(course);
		if(result.hasErrors()) {
			return "new_course";
		}else {
			return "redirect:/";
		}
		
	}

	@GetMapping("/update/{id}")
	public String showFormForUpdate(@PathVariable( value = "id") long id, Model model) {

		Course course = courseService.getCourseById(id);
		model.addAttribute("course", course);
		return "update_course";
	}

	@GetMapping("/delete/{id}")
	public String deleteCourse(@PathVariable (value = "id") long id) {

		this.courseService.deleteCourseById(id);
		return "redirect:/";
	}


	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo,
								@RequestParam("sortField") String sortField,
								@RequestParam("sortDir") String sortDir,
								Model model) {
		int pageSize = 5;

		Page<Course> page = courseService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Course> listCourses = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listCourses", listCourses);
		return "index";
	}
}
