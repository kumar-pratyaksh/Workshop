package com.avizva.dao;

import java.util.List;

import com.avizva.model.Student;

public interface StudentDao {

	public boolean save(Student student);

	public boolean update(Student student);

	public boolean delete(Student student);

	public List<Student> getAll();

	public Student get(String id);

}
