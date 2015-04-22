package com.bastien.student2.src;

//import junit.framework.TestCase;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world !");
	}
	
    /*public void test() throws Exception {
    	
    	   	
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
        
    }*/
}