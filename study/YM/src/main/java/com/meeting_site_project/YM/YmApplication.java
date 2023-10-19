package com.meeting_site_project.YM;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.meeting_site_project.YM.mapper"})
@SpringBootApplication
public class YmApplication {

	public static void main(String[] args) {
		SpringApplication.run(YmApplication.class, args);
	}

}
