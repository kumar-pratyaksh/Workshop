package com.avizva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView callIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/admin")
	public ModelAndView openAdminPanel() {
		return new ModelAndView("adminPanel");
	}

	// @RequestMapping("/login")
	// public ModelAndView openLogin() {
	// return new ModelAndView("login");
	// }

}
