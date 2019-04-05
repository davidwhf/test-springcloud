package com.zzzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul API网关启动类
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@SpringBootApplication	//springboot启动注解
@EnableEurekaClient 	//eureka客户端注解
@EnableZuulProxy	//开启zuul的API网关功能
public class ZuulApplication {
	
	public static void main(String [] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}
}