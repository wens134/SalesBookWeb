package com.spinel.hr.exception;

public class AuthorizationException extends RuntimeException {

	public AuthorizationException(String msg){
		super(msg);
	}
	public AuthorizationException(String msg,Throwable e){
		super(msg,e);
	}
	public AuthorizationException(Throwable e){
		super(e);
	}
	public AuthorizationException(){
		super();
	}
	
}
