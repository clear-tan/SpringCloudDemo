package com.atguigu.springcloud.cfgbeans;


import org.bouncycastle.crypto.signers.RandomDSAKCalculator;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule getRules() {
		//Ribbon的负载均衡策略 想要哪种策略就new 哪个
		return new RandomRule();
	}
	
}
