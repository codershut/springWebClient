package com.webclient.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.reqmodal.CmsFingPayRequestDto;
import com.webclient.reqmodal.RequestModelTest;
import com.webclient.util.UtilApiCall;

@RestController
public class MyController {

	
	@Autowired
	UtilApiCall apiCall;
	
	@GetMapping("/api/v1")
	public String getClient() {		
		String uri="http://localhost:9090/getApi";
		HttpHeaders headers = new HttpHeaders();
		headers.add("mid", "6");
		headers.add("urn", "12345");
		String response=apiCall.getMethod(uri,headers);
		System.err.println(response);
		return response;
	}
	
	@PostMapping("/api/post")
	public void postClient(@RequestBody CmsFingPayRequestDto cmsFingPayRequestDto) {
		String uri="http://10.10.20.114:8080/paymentGateway/cmsFingPayment";
		HttpHeaders headers = new HttpHeaders();
		headers.add("mid", "6");
		headers.add("urn", "12345");
		headers.add("smid", "343");
		headers.add("Authorization", "Basic MTAwMDAwMDAxMjpUZXN0QDEyMw==");		
		
		String response=apiCall.postMethod(uri, headers, new JSONObject(cmsFingPayRequestDto).toString());
		System.err.println(response);
		
	}
	
}
