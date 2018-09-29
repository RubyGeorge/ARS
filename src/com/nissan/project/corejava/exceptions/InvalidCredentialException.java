package com.nissan.project.corejava.exceptions;

@SuppressWarnings("serial")
public class InvalidCredentialException extends Exception {
 String msg;

public InvalidCredentialException(String msg) {
	this.msg = msg;
}

public String toString(){
	return msg;
}
public String getMessage(){
	 return msg;
 }
}
