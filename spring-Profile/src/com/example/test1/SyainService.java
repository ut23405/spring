package com.example.test1;
import org.springframework.beans.factory.annotation.Autowired;

public class SyainService {
	@Autowired
	private IMessage iMessage;

	public String getMessage() {
		return iMessage.getMessage();
	}
}