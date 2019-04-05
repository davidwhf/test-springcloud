package com.zzzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon负载均衡测试控制器
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@RestController
@RequestMapping("/ribbon")
public class TestRibbonController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/test")
	public String test(){
		
		//通过服务应用名调用服务生产者提供的服务(必须在RestTemplate的Bean上加@LoadBalanced注解)
		//当服务生产者有多个实例(一个应用名对应多个实例标识)时,会以合理的方式进行负载
		return restTemplate.getForObject("http://springcloud-eureka-provider/hello/testRibbon", String.class);
	}
}