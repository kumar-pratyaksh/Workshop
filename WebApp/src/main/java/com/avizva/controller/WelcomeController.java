package com.avizva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.avizva.model.Student;

@Controller
public class WelcomeController {

	@RequestMapping("/ping")
	@ResponseBody
	public String ping() {
		return "Pong";
	}

	@RequestMapping("/")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/welcome")
	public ModelAndView showWelcome(@ModelAttribute Student student) {
		System.out.println(student);
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
}
