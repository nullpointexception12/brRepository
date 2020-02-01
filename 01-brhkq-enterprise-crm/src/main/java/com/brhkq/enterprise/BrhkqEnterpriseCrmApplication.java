package com.brhkq.enterprise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.brhkq.enterprise.dao")
public class BrhkqEnterpriseCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrhkqEnterpriseCrmApplication.class, args);

	}

}
