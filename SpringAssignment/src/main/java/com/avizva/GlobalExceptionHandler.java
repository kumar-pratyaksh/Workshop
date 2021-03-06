package com.avizva;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public ModelAndView nullPointerExceptionHandler() {
		return new ModelAndView("exception").addObject("exception", "null pointer");
	}

}
