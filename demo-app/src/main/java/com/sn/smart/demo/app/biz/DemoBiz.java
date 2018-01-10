package com.sn.smart.demo.app.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.smart.demo.api.DemoService;
import com.sn.smart.demo.app.vo.DemoVo;
import com.sn.smart.demo.dto.DemoDto;

@Service
public class DemoBiz {

	@Autowired
	private DemoService demoService;

	public String sayHello(String name) {
		return demoService.sayHello(name);
	}

	public String sayHello(DemoVo vo) {
		DemoDto dto = new DemoDto();
		dto.setName(vo.getName());
		return demoService.sayHello(dto);
	}

}
