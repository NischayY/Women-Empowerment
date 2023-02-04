package com.example.Women.Empowerment.exception;

public class TraineeCourseNotPresentException extends Exception{
	private String msg;

	public TraineeCourseNotPresentException(String msg) {
		super();
		this.msg = msg;
	}

	public TraineeCourseNotPresentException() {
		super();
	}
	
}
