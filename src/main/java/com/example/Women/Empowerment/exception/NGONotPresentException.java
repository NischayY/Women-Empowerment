package com.example.Women.Empowerment.exception;

public class NGONotPresentException extends Exception{
	private String msg;

	public NGONotPresentException(String msg) {
		super();
		this.msg = msg;
	}

	public NGONotPresentException() {
		super();
	}
}
