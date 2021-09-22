package com.sapient.moviesearch.service;

import org.springframework.http.ResponseEntity;

import com.sapient.moviesearch.model.SearchByCityResponse;

public interface SearchService {
	
	
	public SearchByCityResponse getdetails(String city);

}
