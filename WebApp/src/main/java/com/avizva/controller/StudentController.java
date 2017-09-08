package com.avizva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avizva.dao.StudentDao;
import com.avizva.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@RequestMapping("/addView")
	public ModelAndView addView() {
		return new ModelAndView("add");
	}

	@RequestMapping("/updateView")
	public ModelAndView updateView() {
		return new ModelAndView("update");
	}

	@RequestMapping("/deleteView")
	public ModelAndView deleteView() {
		return new ModelAndView("delete");
	}

	@RequestMapping("/save")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		String message = "Data saved Successfully";
		ModelAndView modelAndView = new ModelAndView("index");
		if (studentDao.save(student) > 0) {
			modelAndView.addObject("message", message);
		} else {
			modelAndView.addObject("message", "Data not saved!");
		}
		return modelAndView;
	}

	@RequestMapping("/update")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView("index");
		if (studentDao.update(student) > 0) {
			modelAndView.addObject("message", "Updated successfully");
		} else {
			modelAndView.addObject("message", "Not Updated");
		}
		return modelAndView;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView("index");
		if (studentDao.delete(student) > 0) {
			modelAndView.addObject("message", "Deleted successfully");
		} else {
			modelAndView.addObject("message", "Not Deleted");
		}
		return modelAndView;
	}

	@RequestMapping("/viewView")
	public ModelAndView viewStudents() {
		ModelAndView modelAndView = new ModelAndView("view");
		List<Student> students = studentDao.view();
		System.out.println(students);
		modelAndView.addObject("students", students);
		return modelAndView;
	}

}
