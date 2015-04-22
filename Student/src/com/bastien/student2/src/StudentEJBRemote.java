package com.bastien.student2.src;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface StudentEJBRemote {
	
	public void addStudent(Student student) throws Exception;
	public void deleteStudent(Student student) throws Exception;
	public List<Student> findStudents() throws Exception;
	public Student findStudent(long id) throws Exception;
	
}
