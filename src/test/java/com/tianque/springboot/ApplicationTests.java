package com.tianque.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tianque.entity.MyProperties;
import com.tianque.entity.TestConfig;
import com.tianque.mapper.UserMapper;
import com.tianque.service.UserService;

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

	// 在spring boot 里，我们只需在application.properties定义属性，直接使用@Value 注入即可
	@Value("${spring.datasource.password}")
	private String password;
	@Test
	public void contextLoads() {
		System.out.println(userService.getTestCase());
	}

}
