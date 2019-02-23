package com.webstack.bean;

public class Faculty extends Person {

	private String course;
	private String deptName;

	public Faculty(int personId, String name, Address address) {
		super(personId, name, address);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void display() {
		//super.display();
		System.out.println(" "+this.course+" "+this.deptName);
	}

}
