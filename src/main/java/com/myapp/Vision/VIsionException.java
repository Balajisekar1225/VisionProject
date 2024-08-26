package com.myapp.Vision;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class VIsionException {
	@ExceptionHandler (AgeException.class)
	public ResponseEntity<Object>s (AgeException ae) {
		return new ResponseEntity<Object>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}

}


