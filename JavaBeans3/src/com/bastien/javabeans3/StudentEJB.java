package com.bastien.javabeans3;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

@Stateless
public class StudentEJB implements StudentEJBRemote {

    @PersistenceContext(unitName = "student-unit", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    @Override
    public void addStudent(Student student) throws Exception {
        entityManager.persist(student);
    }

    @Override
    public void deleteStudent(Student student) throws Exception {
        entityManager.remove(student);
    }

    @Override
	@SuppressWarnings("unchecked")
	public List<Student> findStudents() throws Exception {
        Query query = entityManager.createQuery("SELECT s from Student as s");
        return query.getResultList();
    }
    
    @Override
    public Student findStudent(long id) throws Exception {
    	Query query = entityManager.createQuery("SELECT s from Student as s WHERE id = " + id);
    	return (Student) query.getSingleResult();
    }
}
