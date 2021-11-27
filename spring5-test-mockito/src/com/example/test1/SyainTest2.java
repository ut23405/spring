package com.example.test1;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SyainTest2 {

	@Test
	public void test1() {
		//モックを作成
		Syain s1 = mock(Syain.class); 
		s1.getHello("b");
		
		verify(s1).getHello("b"); //成功
		
		// スタブを作成
		when(s1.getHello("b")).thenReturn("bさんですね");

		String t1 = s1.getHello("b");
		assertThat(t1,is("bさんですね")); //成功
	}
	@Test
	public void test2() {
		//モックを作成
		Syain s1 = mock(Syain.class);
		// スタブを作成
		when(s1.getHello(null)).thenReturn("nullですよ");

		String t1 = s1.getHello(null);
		assertThat(t1,is("nullですよ")); //成功
	}
}
