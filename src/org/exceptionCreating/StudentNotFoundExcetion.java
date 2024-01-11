package org.exceptionCreating;

public class StudentNotFoundExcetion extends Exception{
	@Override
	public String getMessage() {
		System.out.println("The student id is not available.");
		return super.getMessage();
	}
}
