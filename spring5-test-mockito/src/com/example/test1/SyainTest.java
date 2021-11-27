package com.example.test1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SyainTest {
	@Test
	public void test1() {
		Syain s1 = new Syain();
		String msg = s1.getHello("a");
		assertThat(msg,is("aさん、こんにちは")); //成功
	}
	@Test
	public void test2() {
		Syain s1 = new Syain();
		String msg = s1.getHello(null);
		assertThat(msg,is("nullです")); //成功
	}
}
