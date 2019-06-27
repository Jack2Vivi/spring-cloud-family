package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.NativeEnvironmentProperties;
import org.springframework.cloud.config.server.environment.NativeEnvironmentRepository;
import org.springframework.cloud.config.server.environment.NativeEnvironmentRepositoryFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient(autoRegister = false)
public class ConfigApplication {

	public static void main(String[] args) {
		//PropertySourceLocator
		//@Retryable
		ConfigServicePropertySourceLocator
		SpringApplication.run(ConfigApplication.class, args);
	}

//	@Bean
//	public NativeEnvironmentRepository nativeEnvironmentRepository(
//			NativeEnvironmentRepositoryFactory factory,
//			NativeEnvironmentProperties environmentProperties) {
//		return factory.build(environmentProperties);
//	}

}
