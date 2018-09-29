package com.nissan.project.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.nissan.project.corejava.model.Flight;

public class EditRepository {
	Connection con;
	Statement st;
	ResultSet rs;
	public EditRepository(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		     con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservation?useSSL=false","root","Ritzberry1$");
		     st=con.createStatement();
			}catch(Exception e){
				
			}
	}
	public boolean check(String name){
		try{
		rs=st.executeQuery("select * from flights");
		while(rs.next()){
			if(rs.getString("flightName").equals(name))
				return true;
		}}
		catch(SQLException e){
			
		}
		return false;
	}
 public	void addFlight(Flight f){
	 try{
			st.executeUpdate("insert into flight(flightName,airlines,type,capacity,source,destination) values('"+f.getFlightName()+"','"+f.getAirlines()+"','"+f.getType()+"','"+f.getCapacity()+"','"+f.getSource()+"','"+f.getDestination()+"')");
			}catch(Exception e){
				
			}
	}
 public void removeFlight(String name){
	 try{
		 st.executeUpdate("delete from flight where flightName='"+name+"'");
	 }catch(Exception e){
		 
	 }
 }
 public void editDetails(String name){
	 @SuppressWarnings("resource")
	Scanner sc=new Scanner("System.in");int ch;
	 try{
	 do{
		 
	    System.out.println("1.Edit name 2.Edit airlines 3.Edit class 4.Edit Capacity 5.Edit Source 6.Edit Destination 7.Exit");
	    ch=sc.nextInt();
	    switch(ch){
	    case 1:
	    System.out.println("Enter name");
	    String nam=sc.next();
	    if(!nam.equals(name)){
	    	if(!check(nam))
	    st.executeUpdate("update flight set flightName='"+nam+"' where flightName='"+name+"'");
	    	else
	    		System.out.println("Flight already entered");
	    }
	    break;
	    case 2:
	    System.out.print("Enter the airlines :");
		String airlines=sc.next();
		 st.executeUpdate("update flight set flightName='"+airlines+"' where flightName='"+name+"'");
		break;
	    case 3:
		System.out.print("Economy/Business :");
		String type=sc.next();
		 st.executeUpdate("update flight set flightName='"+type+"' where flightName='"+name+"'");
		break;
	    case 4:
		System.out.print("Capacity : ");
		int cap=sc.nextInt();
		 st.executeUpdate("update flight set flightName='"+cap+"' where flightName='"+name+"'");
		break;
	    case 5:
		System.out.print("Source :");
		String srce=sc.next();
		 st.executeUpdate("update flight set flightName='"+srce+"' where flightName='"+name+"'");
		break;
	    case 6:
		System.out.print("Destination :");
		String dest=sc.next();
		 st.executeUpdate("update flight set flightName='"+dest+"' where flightName='"+name+"'");
		break;
	    case 7:
	    	break;
	    default:
	    	System.out.println("Invalid choice");
	    	}}while(ch!=7);
	 }catch(Exception e){
		 
	 }
 }
 public void show(){
	 try{
			rs=st.executeQuery("select * from flights");
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}}
			catch(SQLException e){
				
			}
 }
}
