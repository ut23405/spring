package com.example.test1;

import java.util.List;

public class SyainBkup {
	private String Id;
	private String name;
	private List<String> Shikaku;
	public String getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public List<String> getShikaku() {
		return Shikaku;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setShikaku(List<String> shikaku) {
		Shikaku = shikaku;
	}
	
}
