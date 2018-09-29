package com.nissan.project.corejava.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.nissan.project.corejava.services.UserActivity;


public class Initiator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;String s="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
       try{
        do{
		System.out.println("1.Administrator 2.User ");
		System.out.println("Enter your choice :");
	    ch=Integer.parseInt(br.readLine());
		switch(ch){
		case 1:
			new AdminLogin().input();
			break;
		case 2:
			System.out.println("1.Existing User 2.New User");
			ch=Integer.parseInt(br.readLine());
			if(ch==1)
			   new UserLogin().input(); 
			else
			{
				new UserActivity().register();
			}
			break;
		default:
			System.out.println("Enter a valid choice.");
		}
		System.out.println("Do you want to continue? Y/N");
		s=br.readLine();
       }while(s.equalsIgnoreCase("y"));
		
		
       }catch(Exception e){
    	  
    	   e.printStackTrace();
       }
	}
}
