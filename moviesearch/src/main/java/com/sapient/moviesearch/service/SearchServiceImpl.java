package com.sapient.moviesearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.sapient.moviesearch.client.MovieDeatailsClient;
import com.sapient.moviesearch.model.MovieDetailsRequest;
import com.sapient.moviesearch.model.SearchByCityResponse;

public class SearchServiceImpl implements SearchService{
	@Autowired
	MovieDeatailsClient movieDeatailsClient;
	
	public SearchByCityResponse getdetails(String city){
		
		SearchByCityResponse searchByCityResponse=new SearchByCityResponse();
		
		MovieDetailsRequest req=new MovieDetailsRequest();
		searchByCityResponse=movieDeatailsClient.postCall(req, SearchByCityResponse.class, "getMovieDetails");
		
		
		return searchByCityResponse;
		
	}

}
