package com.example.test1;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommService {
	RestTemplate rest = new RestTemplate();
	public static final String URL1 
		= "http://httpbin.org/get";
	public static final String URL2 
		= "http://httpbin.org/post";

	public void getData() {
		String r1 = rest.getForObject(URL1, String.class);
		System.out.println(r1); //‡@•¶š—ñ‚ªo—Í‚³‚ê‚é
		
		RestDto r2 = rest.getForObject(URL1, RestDto.class);
		System.out.println("2‰ñ–Ú=" + r2.getUrl()); //‡Ahttp://httpbin.org/get
		
		Map<String,String> color = new HashMap<>();
		color.put("a", "red");
		color.put("b", "blue");
		String r3 = rest.postForObject(URL2, color,String.class);
		System.out.println(r3); //‡B•¶š—ñ‚ªo—Í‚³‚ê‚é
	}
}