package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
	private static final String REST_URL_PREFIX = "http://localhost:8001";
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept)
	{
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}
	@RequestMapping(value = "/consumer/demo")
	public String consumerDemo() {
		System.out.println("进入consumer方法");
		 return restTemplate.getForObject(REST_URL_PREFIX + "/dept/demo", String.class);
	}
	
	// 测试@EnableDiscoveryClient,消费端可以调用服务发现
		@RequestMapping(value = "/consumer/dept/discovery")
		public Object discovery()
		{
			return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
		}
}
