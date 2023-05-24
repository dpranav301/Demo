package com.example.demo.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public String HandleResourceNotFoundException(ResourceNotFoundException e)
	{
		return e.getMessage();
	}
}
