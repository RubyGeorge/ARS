package com.nissan.project.corejava.services;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.nissan.project.corejava.dao.Registration;
import com.nissan.project.corejava.model.UserData;

public class UserActivity {
	static Scanner sc=new Scanner(System.in);
public static void main() {
	System.out.println("1.Book a flight 2.View Bookings 3.Edit Profile ");
	int ch=sc.nextInt();
	sc.nextLine();
	switch(ch){
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	}
}
public void register(){
	UserData user;
	Registration reg=new Registration();
	boolean validate=true;
	System.out.println("Enter your name");
	String name=sc.nextLine();
	String usernm="";
	String pass="";
	String num="";
	String gender="";
	String mail="";
	while(validate){
		System.out.println("Enter username: ");
		usernm=sc.nextLine();
		if(!(reg.check(usernm))){
		System.out.println("UserName already exists");	
		}
		else
			validate=false;
	}
	validate=true;
	while(validate){
		System.out.println("Enter password: ");
		usernm=sc.nextLine();
		if(!Pattern.matches("[a-zA-Z0-9]+", pass)){
		
		}
		else
			validate=false;
	}
	validate=true;
	while(validate){
		System.out.println("Enter email id: ");
		mail=sc.nextLine();
		if(!Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+", mail))
			System.out.println("Enter a valid mail");
		else
			validate=false;
	}
	validate=true;
	while(validate){
		//System.out.println("Enter your number");
		num=sc.nextLine();
		if(!Pattern.matches("[0-9]{10}", num))
			System.out.println("Enter a valid phone number");
		else
			validate=false;
	}
	validate=true;
	while(validate){
		System.out.println("M/F:");
		gender=sc.nextLine();
		if(!Pattern.matches("[M|F|m|f]", gender))
			System.out.println("M/F");
		else
			validate=false;
	}
	user=new UserData(usernm,name,num,mail,gender);
	reg.add(user);
	reg.adduser(usernm, pass);
	main();
}
}
