package com.sn.smart.order.service;

import com.sn.smart.demo.api.DemoService;
import com.sn.smart.demo.dto.DemoDto;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoDto dto) {
		return "hello, " + dto.getName();
	}
}
