package com.webstack.bean;

public class Contact {

	private String mobileNo;
	private String email;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.print(this.mobileNo+" "+this.email+" ");
	}

}
