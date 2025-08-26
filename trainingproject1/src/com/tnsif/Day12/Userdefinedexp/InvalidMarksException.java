//Program to define User defined exception class
package com.tnsif.Day12.Userdefinedexp;

public class InvalidMarksException extends Exception{

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}

	
}