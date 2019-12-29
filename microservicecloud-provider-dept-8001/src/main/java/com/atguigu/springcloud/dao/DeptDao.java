package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//import com.atguigu.springcloud.bean.Dept;
import com.atguigu.springcloud.entities.Dept;


@Mapper
public interface DeptDao {
	@Select("select * from dept where deptno=#{deptno}")
	public Dept findById(long id);
	
	@Select("INSERT INTO dept(dname,db_source) VALUES(#{dname},#{db_source})")
	public boolean add(Dept dept);

}
