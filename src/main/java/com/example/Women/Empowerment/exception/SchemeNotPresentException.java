package com.example.Women.Empowerment.exception;

public class SchemeNotPresentException extends Exception{
	private String msg;

	public SchemeNotPresentException(String msg) {
		super();
		this.msg = msg;
	}

	public SchemeNotPresentException() {
		super();
	}
}
