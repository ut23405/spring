package com.example.test1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommService {
	@Autowired
	RestTemplate restTemplate;

	private static final String URL2 = "http://httpbin.org/post";

	public void getData() {
		Map<String, String> color = new HashMap<>();
		color.put("a", "red");
		color.put("b", "blue");

		ResponseEntity<RestDto> r2
				= restTemplate.postForEntity(URL2, color, RestDto.class);
		System.out.println("Code=" + r2.getStatusCode()); //200 OK
		System.out.println("ContentType=" + r2.getHeaders().getContentType()); //application/json
		
		System.out.println(r2.getBody().getUrl()); //http://httpbin.org/post
		System.out.println(r2.getBody().getHeaders().getAccept());// application/json, application/*+json
		System.out.println(r2.getBody().getHeaders().getUserAgent());// Java/11.0.11
		System.out.println(r2.getBody().getHeaders().getHost());// httpbin.org
	}
}