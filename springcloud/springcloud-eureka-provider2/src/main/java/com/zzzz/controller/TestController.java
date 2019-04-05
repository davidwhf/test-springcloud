package com.zzzz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务生产者2测试控制器
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@RestController
public class TestController {
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		
		return "provider2>hello: " + name;
	}
}