package com.avizva.dao;

import java.util.List;

import com.avizva.model.Student;

public interface StudentDao {

	int save(Student student);

	int update(Student student);

	int delete(Student student);

	List<Student> view();

}
