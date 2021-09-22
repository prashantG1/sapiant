package com.sapient.moviesearch.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class MovieDeatailsClient {

	@Autowired
	public WebClient webClient;
	
	
	public <T> T postCall(Object request, Class<T>response, String apiName) {
		
		return webClient.post().uri(String.join("/"+apiName,"",""))
				.body(BodyInserters.fromValue(request)).retrieve()
				.bodyToMono(response).block();
				
	}
	
}
