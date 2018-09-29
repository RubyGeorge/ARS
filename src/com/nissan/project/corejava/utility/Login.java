package com.nissan.project.corejava.utility;


import java.util.Scanner;

abstract public class Login {
	String name;
	String password;
	void input() {
		try{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter username :");
		name=sc.nextLine();
		System.out.println("Enter password :");
		password=sc.nextLine();	
			verify();
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

    abstract void verify();
}
