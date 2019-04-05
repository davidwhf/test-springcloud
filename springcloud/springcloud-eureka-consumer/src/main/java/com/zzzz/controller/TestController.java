package com.zzzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者测试控制器
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/test")
	public String test(){
		
		//通过IP+端口调用服务生产者提供的服务(RestTemplate的Bean上不能加@LoadBalanced注解)
		return restTemplate.getForObject("http://127.0.0.1:9010/hello/test", String.class);
	}
}