package com.example.Women.Empowerment.exception;

public class SchemeAlreadyExistsException extends Exception{
	private String msg;

	public SchemeAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}

	public SchemeAlreadyExistsException() {
		super();
	}
}
