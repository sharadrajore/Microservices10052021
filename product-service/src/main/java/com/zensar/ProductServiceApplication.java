package com.zensar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
@RefreshScope

// http://localhost:9000/actuator/refresh  -> POST
public class ProductServiceApplication {
	
	//@Value("${eureka.instance.hostname}")
	//private String hostName;
	

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	
	/*
	 * @GetMapping("/config") public String getConfiguration() { return hostName; }
	 */
	
	
	
	/*
	 * @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
	 */
	
	

}
