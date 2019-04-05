package com.zzzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * eureka服务消费者启动类
 * @author zhuangyilian
 * @date 2019年4月5日
 */
@SpringBootApplication	//springboot启动注解
@EnableEurekaClient 	//eureka客户端注解,也可使用@EnableDiscoveryClient
@EnableCircuitBreaker	//开启断路器功能
public class EurekaConsumerApplication {
	
	public static void main(String [] args) {
		new SpringApplicationBuilder(EurekaConsumerApplication.class).web(true).run(args);
	}
	
	/**
	 * 实例化RestTemplate
	 * RestTemplate是Spring提供的用户访问Rest服务的客户端
	 * @author zhuangyilian
	 * @date 2019年4月4日
	 * @return
	 */
	@Bean
	@LoadBalanced	//开启负载均衡(Eureka客户端依赖包已集成了Ribbon负载均衡)
	public RestTemplate restTemplate(){
		
		return new RestTemplate();
	}
}