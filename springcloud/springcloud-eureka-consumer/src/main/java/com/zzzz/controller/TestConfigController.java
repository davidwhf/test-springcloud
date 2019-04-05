package com.zzzz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分布式配置测试控制器
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@RestController
@RefreshScope	//开启actuator刷新机制(使用post方式执行/refresh,即可更新配置)
@RequestMapping("/config")
public class TestConfigController {
	
    @Value("${env}")
    private String env;

	@GetMapping("/test")
	public String test(){
		
		return env;
	}
}