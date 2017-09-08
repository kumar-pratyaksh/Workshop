package com.avizva.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.avizva.model.User;

@Controller
public class UserController {

	@RequestMapping("/")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("index");
		}
		return new ModelAndView("sucess").addObject("user", user);
	}
}
