package com.niu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.niu.mapper")
@EnableCaching
public class SpringbootMicrohrServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicrohrServerApplication.class, args);
	}

}
