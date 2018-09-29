package com.nissan.project.corejava.utility;



import com.nissan.project.corejava.dao.AdminVerification;
import com.nissan.project.corejava.exceptions.*;
import com.nissan.project.corejava.model.AdminData;
import com.nissan.project.corejava.services.AdminActivity;



public class AdminLogin extends Login{
	static int count=0;
void verify() {
	AdminData ad=new AdminVerification().verify();
	try{
	
	 
	if((this.name).equalsIgnoreCase(ad.getName())){
		if((this.password).equals(ad.getPassword())){
		
			AdminActivity.main();
		}
		else 
			throw new InvalidCredentialException("Wrong password");
	}
	else
		throw new InvalidCredentialException("No such user");
	
	}catch(InvalidCredentialException e){
			System.out.println(e.getMessage());
	    count++;
	    if(count<3){
	    	input();
	    }
	    else{
	    	count=0;
	    	return;
	    }
	}
	catch(Exception e){
		
	}
}
}
