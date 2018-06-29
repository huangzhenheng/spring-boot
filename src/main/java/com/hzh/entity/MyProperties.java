package com.hzh.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pro")
public class MyProperties {
	// 使用@Value注入每个配置在实际项目中会显得格外麻烦，因为我们的配置通常会是许多个，使用@Value 注入很多次。
	// Spring Boot 还提供了基于类型安全的配置方式，通过@ConfigurationProperties将 properties属性和
	// 一个Bean 及其属性关联，从而实现类型安全的配置。
	// prefix 属性指定
	// properties的配置的前缀，通过@PropertySource("classpath:config/grid.properties")指定
	// properties文件的位置
	
	private String passWd;

	public String getPassWd() {
		return passWd;
	}

	// 属性set 后的字符串要和前缀后的字符串一样（首字母不区分大小写）
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

}
