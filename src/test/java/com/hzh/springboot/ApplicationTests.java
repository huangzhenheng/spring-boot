package com.hzh.springboot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzh.entity.MyProperties;
import com.hzh.entity.TestConfig;
import com.hzh.entity.User;
import com.hzh.mapper.UserDao;
import com.hzh.mapper.UserMapper;
import com.hzh.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private MyProperties myProperties;

	@Autowired
	private TestConfig testConfig;
	@Autowired
	private UserDao userDao;

	// 在spring boot 里，我们只需在application.properties定义属性，直接使用@Value 注入即可
	@Value("${spring.datasource.password}")
	private String password;
	@Test
	public void contextLoads() {
		System.out.println(password);
		System.err.println(userMapper.getUserById(1L));
		System.out.println(userService.getTestCase());
		List<User> users=userDao.queryUserList();
		for (User user : users) {
			System.err.println(user.getName());
		}
	}

}
