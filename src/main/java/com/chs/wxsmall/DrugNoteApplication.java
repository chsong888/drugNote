package com.chs.wxsmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableAutoConfiguration
@MapperScan("com.chs.wxsmall.mapper")
@SpringBootApplication
public class DrugNoteApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DrugNoteApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DrugNoteApplication.class);
	}

}
