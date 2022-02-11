package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordTest {
	@Autowired
	Pbkdf2PasswordEncoder passwordEncoder;

	public void chkPassword() {
		String psd = passwordEncoder.encode("あいうえ");
		System.out.println(psd);
		// b3ec9dffa2803757308295fa7cdede56a907d6d5edf9a9519da754e8ed0fbd171bd7d327e3eee0f5

		if (passwordEncoder.matches("あいうえ", psd)) {
			System.out.println("OK"); // OK
		}
	}
}