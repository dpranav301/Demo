package com.example.demo.Exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String str)
	{
		super(str);
	}
}
