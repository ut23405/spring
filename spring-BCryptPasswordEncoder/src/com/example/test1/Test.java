package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Test {
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	public void chkPassword() {
		String psd = passwordEncoder.encode("あいうえ");
		System.out.println(psd);
		// $2a$10$Up7JTF3FQ/mnvIzyIq8byeliDSXhc6NPxzw7PcZ181ENqtXtPRP9y

		if (passwordEncoder.matches("あいうえ", psd)) {
			System.out.println("OK"); // OK
		}
	}
}