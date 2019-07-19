package com.example.config;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient(autoRegister = true)
@EnableEurekaClient
@RestController
public class ConfigApplication {

	@Autowired
	private EurekaClient client;

	public static void main(String[] args) {
		//EurekaInstanceConfigBean
		SpringApplication.run(ConfigApplication.class, args);
	}

	@RequestMapping("/client")
	public String client() {
		return client.getAllKnownRegions().toString();
	}

//	@Bean
//	public NativeEnvironmentRepository nativeEnvironmentRepository(
//			NativeEnvironmentRepositoryFactory factory,
//			NativeEnvironmentProperties environmentProperties) {
//		return factory.build(environmentProperties);
//	}
}
