package com.nissan.project.corejava.exceptions;

@SuppressWarnings("serial")
public class InvalidChoiceException extends Exception {
	String msg;
	
	public InvalidChoiceException(String msg) {
		this.msg = msg;
	}

	public String toString(){
		return msg;
	}
	public String getMessage(){
		 return msg;
	 }
}
