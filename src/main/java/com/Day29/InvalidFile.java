package com.Day29;

/**
 * Customer exception class
 */
public class InvalidFile extends Exception {
	public InvalidFile() {
		super();
	}
	
	public InvalidFile(String message) {
		super(message);
	}
}