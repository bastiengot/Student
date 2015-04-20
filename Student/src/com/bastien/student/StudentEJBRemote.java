package com.bastien.student;

import java.util.List;

public interface StudentEJBRemote {
	
	public void addStudent(Student student) throws Exception;
	public void deleteStudent(Student student) throws Exception;
	public List<Student> findStudents() throws Exception;
	public Student findStudent(long id) throws Exception;
	
}
