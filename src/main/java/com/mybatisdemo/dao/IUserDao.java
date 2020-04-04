package com.mybatisdemo.dao;

import com.mybatisdemo.domain.User;

import java.util.List;

/**
 * @program: day01_01mybatis
 * @author: zhang-zi-ang
 * @create: 2020-04-01 23:16
 * @description: 用户的持久层接口
 */
public interface IUserDao {
	/**
	* @Description: 查询所有操作
	* @Param: 
	* @return: 
	* @Author: zhang-zi-ang
	* @Date: 2020/4/1
	*/
	List<User> findAll();
}
