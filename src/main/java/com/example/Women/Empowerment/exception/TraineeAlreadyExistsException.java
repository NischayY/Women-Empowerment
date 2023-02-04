package com.example.Women.Empowerment.exception;

public class TraineeAlreadyExistsException extends Exception{
	private String msg;

	public TraineeAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}

	public TraineeAlreadyExistsException() {
		super();
	}
}
