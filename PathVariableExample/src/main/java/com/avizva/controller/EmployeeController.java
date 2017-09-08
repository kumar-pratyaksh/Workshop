package com.avizva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avizva.dao.EmployeeDao;
import com.avizva.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/hello/{id}")
	public ModelAndView getEmployee(@PathVariable("id") int id) {
		Employee employee = employeeDao.getDetail(id);
		return new ModelAndView("hello").addObject("employee", employee);
	}

	@RequestMapping("/page1/{name}")
	public ModelAndView page1(@PathVariable(name = "name") Employee employee) {
		return new ModelAndView("page1").addObject("emp", employee);
	}

}
