package com.example.registry.client;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thinkpad on 2019/3/23.
 */
@RestController
public class DiscoveryClientInfo {

    @Autowired
    @LoadBalanced
    private EurekaClient discoveryClient;

    @Value("${test.value:default}")
    private String value;
//    @Autowired
//    private EurekaDiscoveryClient client;

    @RequestMapping("/client")
    public String client() {
        return discoveryClient.getApplicationInfoManager().getEurekaInstanceConfig().toString();
    }

    @RequestMapping("/value")
    public String testConfig() {
        return this.value;
    }
}
