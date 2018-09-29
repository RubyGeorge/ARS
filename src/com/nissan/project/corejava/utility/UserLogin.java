package com.nissan.project.corejava.utility;

import com.nissan.project.corejava.dao.UserVerification;
import com.nissan.project.corejava.exceptions.InvalidCredentialException;
import com.nissan.project.corejava.services.UserActivity;

public class UserLogin extends Login{
	static int count=0;
void verify(){
	UserVerification uv=new UserVerification();
	try{
		
	    	 if(uv.verifyUser(this.name)){
	    		 if(uv.verifyPassword(this.name, this.password))
	    		 {
	    			UserActivity.main();
	    		 }
	    		 else
	    			 throw new InvalidCredentialException("Wrong password");
	    	 }
	    	 else
	    		 throw new InvalidCredentialException("No such user");
	}catch(Exception e){
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
}
}
