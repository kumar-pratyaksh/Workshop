package com.avizva.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.avizva.dao.StudentDao;
import com.avizva.dao.impl.StudentDaoImpl;
import com.opensymphony.xwork2.Action;

@Entity
public class Student implements Action {

	@Id
	private String id;

	private String name;

	private String contact;

	public Student() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String execute() {
		StudentDao dao = new StudentDaoImpl();
		if (dao.save(this))
			return "success";
		return "failure";
	}

	public String viewAll() {
		StudentDao dao = new StudentDaoImpl();
		List<Student> students = dao.getAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("students", students);
		return SUCCESS;
	}

	public String showUpdate() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		StudentDao dao = new StudentDaoImpl();
		Student student = dao.get(id);
		this.setId(id);
		this.setName(student.getName());
		this.setContact(student.getContact());
		return SUCCESS;
	}

	public String updateData() {
		StudentDao dao = new StudentDaoImpl();
		System.out.println(this);
		dao.update(this);
		return SUCCESS;
	}

	public String delete() {
		StudentDao dao = new StudentDaoImpl();
		String id = ServletActionContext.getRequest().getParameter("id");
		dao.delete(dao.get(id));
		return SUCCESS;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}
