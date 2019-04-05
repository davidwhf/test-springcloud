package com.zzzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务生产者1启动类
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@SpringBootApplication	//springboot启动注解
@EnableEurekaClient 	//eureka客户端注解
public class EurekaProvider1Application {
	
	public static void main(String [] args) {
		new SpringApplicationBuilder(EurekaProvider1Application.class).web(true).run(args);
	}
}