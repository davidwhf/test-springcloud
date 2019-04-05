package com.zzzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务注册中心启动类
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@SpringBootApplication	//springboot启动注解
@EnableEurekaServer	//eureka服务端注解
public class EurekaServerApplication {
	
	public static void main(String [] args) {
		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
	}
}