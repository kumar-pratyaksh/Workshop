package com.avizva.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public ModelAndView nullPointerExceptionHandler(Exception e) {
		System.out.println("Null pointer exception");
		return new ModelAndView("NullPointerException");
	}

	@ExceptionHandler(value = Exception.class)
	public ModelAndView genericExceptionHandler(Exception e) {
		System.out.println(e);
		return new ModelAndView("exception");
	}

}
