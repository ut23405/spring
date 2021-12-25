package com.example.test1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommService {
	@Autowired
	RestTemplate restTemplate;
	
	private static final String URL2 = "http://httpbin.org/post";

	public void getData() {
		String r1 = restTemplate.postForObject(URL2, null, String.class);
		System.out.println(r1); // 1.下記に実行結果あり

		RestDto r2 = restTemplate.postForObject(URL2, null, RestDto.class);
		System.out.println(r2.getHeaders().getAccept());// application/json, application/*+json
		System.out.println(r2.getHeaders().getUserAgent());// Java/11.0.11
		System.out.println(r2.getHeaders().getHost());// httpbin.org
		
		Map<String, String> color = new HashMap<>();
		color.put("a", "red");
		color.put("b", "blue");
		String r3 = restTemplate.postForObject(URL2, color, String.class);
		System.out.println(r3); // 2.下記に実行結果あり
	}
}