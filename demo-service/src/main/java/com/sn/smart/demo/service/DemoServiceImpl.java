package com.sn.smart.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.smart.demo.api.DemoService;
import com.sn.smart.demo.dto.DemoDto;

@Service
public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoDto dto) {
		return "hello, " + dto.getName();
	}
}
