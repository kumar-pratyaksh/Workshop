package com.avizva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	// IN request mapping we specify the mapping
	// IN model and view constructor we specify the jsp page

	@RequestMapping("/")
	public ModelAndView callIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/page1")
	public ModelAndView callHello() {
		return new ModelAndView("hello");
	}
}
