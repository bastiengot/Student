package com.bastien.student;

import junit.framework.TestCase;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import java.util.List;
import java.util.Properties;


public class Main extends TestCase {

    public void test() throws Exception {
        final Properties p = new Properties();
        p.put("studentDatabase", "new://Resource?type=DataSource");
        p.put("studentDatabase.JdbcDriver", "org.hsqldb.jdbcDriver");
        p.put("studentDatabase.JdbcUrl", "jdbc:hsqldb:mem:studentdb");

        final Context context = EJBContainer.createEJBContainer(p).getContext();
        StudentEJB students = (StudentEJB) context.lookup("java:global/jpa-hibernate/StudentEJB");

        students.addStudent(new Student("Bastien Got", "Rouen", 21));
        students.addStudent(new Student("Bastien Got", "Nancy", 20));
        students.addStudent(new Student("Jean Bernard", "Nice", 23));

        List<Student> list = students.findStudents();
        assertEquals("List.size()", 3, list.size());

        for (Student student : list) {
            students.deleteStudent(student);
        }

        assertEquals("students.finStudents()", 0, students.findStudents().size());
    }
}