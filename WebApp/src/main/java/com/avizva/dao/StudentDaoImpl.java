package com.avizva.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.avizva.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Student student) {
		String query = "insert into students values(?,?,?)";
		return template.update(query, student.getId(), student.getName(), student.getEmail());
	}

	public int update(Student student) {
		String query = "update students set name=?, email=? where id=?";
		return template.update(query, student.getName(), student.getEmail(), student.getId());
	}

	public int delete(Student student) {
		String query = "delete from students where name=?";
		return template.update(query, student.getName());
	}

	public List<Student> view() {
		String query = "select * from students";
		return template.query(query, (rs) -> {
			List<Student> students = new ArrayList<Student>();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				students.add(student);
			}
			return students;
		});
	}

}
