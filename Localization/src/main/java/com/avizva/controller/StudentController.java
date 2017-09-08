package com.avizva.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avizva.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/saveApplication")
	public ModelAndView saveStudentInformation(@ModelAttribute("student") @Valid Student student,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("index");
		}
		return new ModelAndView("success");
	}

	// @InitBinder
	// public void InitBinder(WebDataBinder binder) {
	// // binder.setDisallowedFields(new String[] { "dob" });
	// SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	// binder.registerCustomEditor(Date.class, "dob", new
	// CustomDateEditor(format, false));
	// binder.registerCustomEditor(String.class, "name", new
	// NamePropertyEditor());
	// }

	@ModelAttribute
	public void initialize(Model m) {
		m.addAttribute("message", "Hello, welcome");
	}
}
