package com.nissan.project.corejava.model;

public class AdminData {
 String name;
String password;
public AdminData(String password) {
	this.name = "ADMIN";
	this.password=password;
}
public String getName() {
	return name;
}
public String getPassword() {
	return password;
}


}
