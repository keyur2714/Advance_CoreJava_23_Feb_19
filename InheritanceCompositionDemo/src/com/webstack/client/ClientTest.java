package com.webstack.client;

import java.io.IOException;

import com.webstack.bean.Address;
import com.webstack.bean.Contact;
import com.webstack.bean.Faculty;
import com.webstack.bean.Student;

public class ClientTest {

	public static void main(String[] args) {
	
		Address address = new Address();
		address.setAddress1("A-1106, Alcove Society,");
		address.setAddress2("Kunal Icon Road,Pimple Saudagar,Pune.");
		address.setPinCode("411027");
		
		Contact contact1 = new Contact();
		contact1.setMobileNo("7387029671");
		contact1.setEmail("keyurjava27@gmail.com");
		
		Student student = new Student(10,"keyur",address);
		
		student.setRollNo("06MC32");
		student.setGrade("First");
		student.setHobby("Cricket");
		student.setContact(contact1);
		
		student.display();
		
		Student student2 = new Student(20,"denish",null);
		
		student2.setRollNo("06MC26");
		student2.setGrade("First");
		student2.setHobby("Music");
		
		student2.display();
		
		
		Faculty faculty1 = new Faculty(31,"Vinit",null);
		faculty1.setCourse("Java");
		faculty1.setDeptName("IT");
		faculty1.display();
		
	}

}
