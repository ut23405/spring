package com.example.test1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers {
	@JsonProperty("Accept")
	private String Accept;
	@JsonProperty("Host")
	private String Host;
	@JsonProperty("User-Agent")
	private String UserAgent;
	
	public String getAccept() {
		return Accept;
	}
	public String getHost() {
		return Host;
	}
	public String getUserAgent() {
		return UserAgent;
	}
}
