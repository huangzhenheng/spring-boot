package com.hzh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hzh.mapper.UserDao;

@Configuration // 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
//@ComponentScan(basePackages = "com.hzh.mapper") // 配置扫描包
public class SpringConfig {
	@Bean // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDao getUserDAO() {
        return new UserDao(); // 直接new对象做演示
    }
}
