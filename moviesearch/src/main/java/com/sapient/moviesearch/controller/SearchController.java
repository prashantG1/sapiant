package com.sapient.moviesearch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.moviesearch.model.SearchByCityResponse;
import com.sapient.moviesearch.service.SearchService;

@RestController
@RequestMapping(value="/search")
public class SearchController {
	
	private static final Logger log=LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	SearchService searchServiceImpl;
	
	
	public ResponseEntity<SearchByCityResponse> getdetails(String city) {
		
		SearchByCityResponse searchByCityResponse=searchServiceImpl.getdetails(city);
		
		
		return ResponseEntity.ok().body(searchByCityResponse);
	}

}
