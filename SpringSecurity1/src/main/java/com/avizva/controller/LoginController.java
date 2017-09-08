package com.avizva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/loginAdmin")
	public ModelAndView login() {
		return new ModelAndView("loginAdmin");
	}

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/adminPanel")
	public ModelAndView adminPanel() {
		return new ModelAndView("adminPanel");
	}

	@RequestMapping("/loginError")
	public ModelAndView loginError() {
		return new ModelAndView("error");
	}

}
