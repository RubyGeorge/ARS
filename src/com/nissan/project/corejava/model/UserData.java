package com.nissan.project.corejava.model;

public class UserData {
private String userName;
private String  name;
private String phoneNo;
private String email;
private String gender;
public UserData(String userName, String name, String phoneNo, String email, String gender) {
	this.userName = userName;
	this.name = name;
	this.phoneNo = phoneNo;
	this.email = email;
	this.gender = gender;
}
public String getUserName() {
	return userName;
}
public String getName() {
	return name;
}
public String getPhoneNo() {
	return phoneNo;
}
public String getEmail() {
	return email;
}
public String getGender() {
	return gender;
}

}
