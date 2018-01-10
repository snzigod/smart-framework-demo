package com.sn.smart.demo.api;

import com.sn.smart.demo.dto.DemoDto;

public interface DemoService {

	public String sayHello(String name);

	public String sayHello(DemoDto dto);

}
