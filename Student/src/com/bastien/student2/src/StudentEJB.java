package com.bastien.student2.src;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class StudentEJB implements StudentEJBRemote {

    private EntityManager entityManager = Persistence.createEntityManagerFactory("Student").createEntityManager();
    
    @Override
    public void addStudent(Student student) throws Exception {
		entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteStudent(Student student) throws Exception {
		entityManager.getTransaction().begin();
        entityManager.remove(student);
		entityManager.getTransaction().commit();

    }

	@SuppressWarnings("unchecked")
	@Override
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
