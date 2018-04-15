package com.lzx;

import com.lzx.client.HelloClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = HelloClient.class)
@EnableDiscoveryClient
public class SpringCloudConsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerHystrixApplication.class, args);
	}
}
