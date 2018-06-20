package com.tianque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 每个SpringBoot应用都需要添加以下三个注解
 * 
 * @EnableAutoConfiruration
 * @ComponentScan
 * @Configuration 也可以使用@SpringBootApplication注解来替代， 核心注解主要目的是开启自动配置 Spring Boot
 *                会自动扫描@SpringBootApplication
 *                所在类的同级包以及下级包里的bean。建议入口类放置在groupId+arctifactId组合的包名下
 */
@SpringBootApplication
public class Application {

	// 这是一个标准的java应用的main方法，主要作用是作为项目启动的入口。
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
