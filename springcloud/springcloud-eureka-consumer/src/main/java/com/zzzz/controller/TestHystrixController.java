package com.zzzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * hystrix断路器测试控制器
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@RestController
@RequestMapping("/hystrix")
public class TestHystrixController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/test/{name}")
	@HystrixCommand(fallbackMethod="fallback")	//使用hystrix断路器,并指定服务调用失败后的回调方法
	public String test(@PathVariable String name){
		
		return restTemplate.getForObject("http://springcloud-eureka-provider/hello/" + name, String.class);
	}
	
	/**
	 * hystrix回调方法
	 * 参数及返回值必须与接口方法一致
	 * @author zhuangyilian
	 * @date 2019年4月5日
	 * @param str
	 * @return
	 */
	public String fallback(@PathVariable String name){
		
		return "服务异常,请稍后再试...";
	}
}