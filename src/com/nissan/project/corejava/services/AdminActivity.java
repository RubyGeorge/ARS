package com.nissan.project.corejava.services;

import java.util.Scanner;

import com.nissan.project.corejava.dao.AdminVerification;
import com.nissan.project.corejava.dao.EditRepository;
import com.nissan.project.corejava.exceptions.InvalidChoiceException;
import com.nissan.project.corejava.model.Flight;


public class AdminActivity implements IAdminActivity{
	static Scanner sc= new Scanner(System.in);
public static void main() {
	AdminActivity a=new AdminActivity();
	System.out.println("1.EditSchedule 2.EditFlightRepository 3.View Passengers 4.Change Password");
	int ch=sc.nextInt();
	try{
	switch(ch){
	case 1:
		a.editSchedule();
		break;
	case 2:
		a.editRepository();
		break;
	case 3:
		a.changePassword();
		break;
	default:
		throw new InvalidChoiceException("Invalid choice");
	}
	}catch(Exception e){
		e.getMessage();
	}
}

public void editSchedule(){
	int ch=0;
	do{
    System.out.println("1.Add flight 2.Remove flight 3.Reschedule/Edit flight 4.View list 5.Back");	
    ch=sc.nextInt();
    switch(ch){
    case 1:
    	break;
    case 2:
    	break;
    case 3:
    	break;
    case 4:
    	break;
    case 5:
    	break;
    default:
    	System.out.println("Invalid choice");
    }
	}while(ch!=5);
}
public void editRepository(){
	Flight f;
	EditRepository er=new EditRepository();
	boolean validate=true;int ch=0;
	do{
	System.out.println("1.Add flights 2.Remove flight 3.Edit details 4. Show list of flights 5.Back");
    ch=sc.nextInt();
    sc.nextLine();
	switch(ch){
	case 1:{
		String name="";
		while(validate){	
		System.out.println("Enter flight name:");
		name =sc.nextLine();
		
		if(er.check(name))
			{
			System.out.println("Flight already included!!!");
			}
		else
			validate=false;
			}
		System.out.println("Enter the airlines :");
		String airlines=sc.next();
		
		System.out.println("Economy/Business :");
		String type=sc.next();
		System.out.println("Capacity : ");
		int cap=sc.nextInt();
		System.out.println("Source :");
		String srce=sc.next();
		System.out.println("Destination :");
		String dest=sc.next();
		f=new Flight(name,airlines,type,cap,srce,dest);
		er.addFlight(f);
		break;}
	case 2:{
		System.out.println("Enter the flight name");
		String name=sc.next();
		if(er.check(name)){
		er.removeFlight(name);
		}
		else{
			System.out.println("No such flight exists!");
		}
		break;}
	case 3:{
		System.out.println("Enter the flight name");
		String name=sc.next();
		if(er.check(name)){
		er.editDetails(name);
		}
		else{
			System.out.println("No such flight exists!");
		}
		break;}
	case 4:
		er.show();
		break;
	case 5:
		break;
	}}while(ch!=5);
}
public void changePassword(){
	System.out.println("Enter current password");
	String pass=sc.next();
	if(AdminVerification.change(pass));
	else{
		System.out.println("No such password exists");
		main();
	}
}
}
