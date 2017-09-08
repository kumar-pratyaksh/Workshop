package com.avizva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.avizva.dao.EmployeeDao;
import com.avizva.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/insertEmployee")
	public ModelAndView insertEmployee() {
		return new ModelAndView("insertEmployee", "command", new Employee());
	}

	@RequestMapping("/viewEmployee")
	public ModelAndView viewEmployee(@RequestParam(required = false) String message) {
		return new ModelAndView("viewEmployee").addObject("listEmployee", employeeDao.getAll()).addObject("message",
				message);
	}

	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		boolean status = employeeDao.save(employee);
		String message;
		if (status) {
			message = "Employee details saved successfully";
			return new ModelAndView("redirect:/viewEmployee").addObject("message", message);
		} else {
			message = "Error occured while saving employee data. Please try again";
			return new ModelAndView("insertEmployee").addObject("message", message).addObject("command", employee);
		}

	}

	@RequestMapping("/deleteEmployee/{id}")
	public ModelAndView deleteEmployee(@PathVariable int id) {
		Employee employee = employeeDao.getOne(id);
		employeeDao.delete(employee);
		return new ModelAndView("redirect:/viewEmployee").addObject("message", "Employee deleted");
	}

	@RequestMapping("/updateEmployee/{id}")
	public ModelAndView updateEmployee(@PathVariable int id) {
		Employee employee = employeeDao.getOne(id);
		return new ModelAndView("updateEmployee").addObject("command", employee);
	}

	@RequestMapping("/updateEmployeeDetails")
	public ModelAndView updateEmployeeDetails(@ModelAttribute Employee employee) {
		employeeDao.update(employee);
		return new ModelAndView("redirect:/viewEmployee").addObject("message", "Employee details updated");

	}

}
