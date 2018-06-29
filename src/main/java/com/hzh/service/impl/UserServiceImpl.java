package com.hzh.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.hzh.service.UserService;

@Service(timeout = 5000)
public class UserServiceImpl implements UserService {

	@Override
	public Integer getTestCase() {
		System.out.println("黄振衡");
		return 1222;
	}

}
