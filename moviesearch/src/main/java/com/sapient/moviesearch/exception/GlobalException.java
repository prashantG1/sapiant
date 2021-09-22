package com.sapient.moviesearch.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sapient.moviesearch.model.ErrorResponse;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ErrorResponse> handleException(){
		ErrorResponse errorResponse=new ErrorResponse();
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
		
	}

}
