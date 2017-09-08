package com.avizva.dao;

import java.util.List;

import com.avizva.model.Student;

public interface StudentDao {

	public boolean saveStudent(Student s);

	public boolean update(Student student);

	public boolean delete(int id);

	public Student fetch(int id);

	public List<Student> fetchAll();

	public List<Student> fetchByName(String name);

}
