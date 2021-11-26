package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommService {
	@Autowired
	RestTemplate restTemplate;
	
	public static final String URL1 = "http://httpbin.org/get";
	public static final String URL2 = "http://httpbin.org/post";

	public void getData() {
		String r1 = restTemplate.getForObject(URL1, String.class);
		// String r1 = rest.postForObject(URL2, null, String.class);
		System.out.println(r1); // ①

		RestDto r2 = restTemplate.getForObject(URL1, RestDto.class);
		// RestDto r2 = rest.postForObject(URL2, null, RestDto.class);
		System.out.println(r2.getHeaders().getAccept());// application/json, application/*+json
		System.out.println(r2.getHeaders().getUserAgent());// Java/11.0.11
		System.out.println(r2.getHeaders().getHost());// httpbin.org
	}
}