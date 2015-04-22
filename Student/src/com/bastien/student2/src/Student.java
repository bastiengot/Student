package com.bastien.student2.src;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentID;

    private String name;
    private String adress;
    private int age;

    public Student() {
    }

    public Student(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}