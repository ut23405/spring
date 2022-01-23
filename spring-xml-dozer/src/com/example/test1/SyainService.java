package com.example.test1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

@Service
public class SyainService {
	public void copySyain() {
		Syain syain = new Syain();
		syain.setId("1001");
		syain.setName("suzuki");
		List<String> list1 = new ArrayList<>();
		list1.add("kihon");
		list1.add("database");
		syain.setShikaku(list1);
		
		SyainBkup syainBkup = new SyainBkup();

		Mapper mapper = DozerBeanMapperBuilder.buildDefault();
		mapper.map(syain, syainBkup);
		
		//		syainBkup.setId(syain.getId());
		//		syainBkup.setName(syain.getName());
		//	syainBkup.setShikaku(syain.getShikaku());

		System.out.println(syainBkup.getId()); //1001
		System.out.println(syainBkup.getName()); //suzuki
		System.out.println(syainBkup.getShikaku()); //[kihon, database]
	}
}