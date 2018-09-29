package com.nissan.project.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserVerification {
	Connection con;
	Statement st;
	ResultSet rs;
	public UserVerification(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
	     con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservations?useSSL=false","root","Ritzberry1$");
	     st=con.createStatement();
	     
		}catch(Exception e){
			
		}
	}
	public boolean verifyUser(String name){
		try{
		rs=st.executeQuery("select * from usercredentials");
     while(rs.next())
     {
    	if(rs.getString("user").equals(name)) 
    		return true;
     }
		}catch(Exception e){
			
		}
		return false;
	}
	public boolean verifyPassword(String name, String pass){
		try{
		rs=st.executeQuery("select * from usercredentials where user='"+name+"'");
		rs.next();
		if(rs.getString("pass").equals(pass))
			return true;
		}catch(Exception e){
			
		}
		return false;
	}
}
