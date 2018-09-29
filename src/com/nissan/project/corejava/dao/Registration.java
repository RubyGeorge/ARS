package com.nissan.project.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nissan.project.corejava.model.UserData;

public class Registration {
	Connection con;
	Statement st;
	ResultSet rs;
	public Registration(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		     con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservation?useSSL=false","root","Ritzberry1$");
		     st=con.createStatement();
			}catch(Exception e){
				
			}
	}
	public void add (UserData user){
		try{
		st.executeUpdate("insert into userdata(userName,name,phoneNo,email,gender) values('"+user.getUserName()+"','"+user.getName()+"','"+user.getPhoneNo()+"','"+user.getEmail()+"','"+user.getGender()+"')");
		}catch(Exception e){
			
		}
	}
	public void adduser(String name, String pass){
		try{
			st.executeUpdate("insert into usercredentials(userName,pass) values('"+name+"','"+pass+"')");
			}catch(Exception e){
				
			}
	}
 public boolean check(String nam){
	 try{
	rs=st.executeQuery("select * from userdata");
	while(rs.next()){
		if(rs.getString("user").equals(nam))
			return false;
	}
	 }catch(Exception e){
		 
	 }
	return true;
}

}
