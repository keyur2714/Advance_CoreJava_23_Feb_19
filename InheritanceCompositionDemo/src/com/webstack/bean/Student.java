package com.webstack.bean;

import java.io.IOException;

public class Student extends Person {

	private String grade;
	private String rollNo;
	
	public Student(int personId, String name, Address address) {
		super(personId, name, address);
	}


	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void display() {
		try {
			super.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.rollNo+" "+this.grade+" ");		
	}
	
}
