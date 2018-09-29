package com.nissan.project.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.nissan.project.corejava.model.AdminData;

public class AdminVerification {
public AdminData verify(){
	AdminData ad=null;;
	try{
		
	Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservation?useSSL=false","root","Ritzberry1$");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from admindata");
     rs.next();
   String pass=rs.getString("pass");
    ad=new AdminData(pass);
   
	}catch(Exception e){
		
	}
	 return ad;
}
public static boolean change(String pass){
	try{
		String newPass="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan?useSSL=false","root","Ritzberry1$");
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from admindata");
	     rs.next();
	   if(pass==rs.getString("pass"))
	   {
		   System.out.println("Enter new password");
		   newPass=sc.next();
		   st.executeUpdate("update admindata set pass='"+newPass+"' where pass='"+pass+"'");
	   }
		   
	   
		}catch(Exception e){
			
		}
	return false;
}

}
