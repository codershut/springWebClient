package com.webclient.util;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class UtilApiCall {
	
	@Autowired
	WebClient webClient ;

	public String getMethod(String uri, HttpHeaders headers) {
		try {
			return webClient.get()
					.uri(uri)
					.headers(httpHeaders -> httpHeaders.addAll(headers))
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String postMethod(String uri,HttpHeaders headers, String reqBody) {
		 try {
			return webClient.post()
			            .uri(uri)
			            .contentType(MediaType.APPLICATION_JSON)
			            .headers(httpHeaders -> httpHeaders.addAll(headers))
			            .body(BodyInserters.fromValue(reqBody))
			            .retrieve()
			            .bodyToMono(String.class)
			            .timeout(Duration.ofSeconds(5))
			            .block();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
