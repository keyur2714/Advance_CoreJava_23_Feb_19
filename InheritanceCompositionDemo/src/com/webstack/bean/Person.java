package com.webstack.bean;

import java.io.IOException;

public class Person {

	private int personId;
	private String name;
	private String hobby;
	private Address address;
	private Contact contact;

	public Person(int personId, String name, Address address) {
		this.personId = personId;
		this.name = name;
		if (address == null)
			this.address = new Address();
		else
			this.address = address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void display() throws IOException {
		this.address.display();
		System.out.print(this.personId + " " + this.name + " " + this.hobby + " ");
		if(this.contact != null)
			this.contact.display();
	}

}
