package com.zzzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 分布式配置中心启动类
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@SpringBootApplication	//springboot启动注解
@EnableConfigServer		//开启配置管理服务端功能
@EnableEurekaClient 	//eureka客户端注解
public class ConfigServerApplication {
	
	public static void main(String [] args) {
		new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
	}
}