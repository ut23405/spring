package com.example.test1;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.support.DefaultMessageSourceResolvable;

public class Syain {
	@Autowired
	MessageSource msgSource;

	MessageSourceResolvable hello1 = 
			new DefaultMessageSourceResolvable("syain.hello1"); //こんにちは
	MessageSourceResolvable name1 = 
			new DefaultMessageSourceResolvable("syain.name1"); //suzuki

	public void getName() {
		String message = msgSource.getMessage
				("syain.msg",  //「{0},名前は{1}です」
				new MessageSourceResolvable[] { hello1,name1 },
				Locale.JAPANESE);
		System.out.println(message);
	}
}