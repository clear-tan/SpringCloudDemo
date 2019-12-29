package com.atguigu.springcloud.service;

import java.util.List;

//import com.atguigu.springcloud.bean.Dept;
import com.atguigu.springcloud.entities.Dept;
public interface DeptService {
	
	public Dept findById(long id);
	
	public Dept get(Long id);
	public boolean add(Dept dept);

	public List<Dept> list();
}
