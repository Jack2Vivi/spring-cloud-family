package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient(autoRegister = true)
@EnableEurekaClient
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

//	@Bean
//	public NativeEnvironmentRepository nativeEnvironmentRepository(
//			NativeEnvironmentRepositoryFactory factory,
//			NativeEnvironmentProperties environmentProperties) {
//		return factory.build(environmentProperties);
//	}
}
