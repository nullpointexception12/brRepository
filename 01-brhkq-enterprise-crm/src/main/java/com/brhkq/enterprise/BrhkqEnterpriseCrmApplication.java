package com.brhkq.enterprise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.brhkq.enterprise.dao")
@ServletComponentScan(basePackages = "com.brhkq.enterprise.filter")
public class BrhkqEnterpriseCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrhkqEnterpriseCrmApplication.class, args);
	}

}
