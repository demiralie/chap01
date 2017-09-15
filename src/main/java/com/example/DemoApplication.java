package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.dao.DeptDao;
import com.example.domain.Dept;

import lombok.extern.java.Log;

//-- 방법 1 --
@SpringBootApplication
@Log
public class DemoApplication {

	@Bean
	public Dept dept() {
		log.info("**************************");
		log.info("* DemoApplication.dept() *");
		log.info("**************************");
		return new Dept(90, "xxx", "yyy");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	
}

// -- 방법 2 --

// @SpringBootApplication
// @Log
// public class DemoApplication {
//
// // @Autowired
// // DeptDao dao ; // DI [Dependency Injection] - 의존주입
//
// public static void main(String[] args) {
// SpringApplication.run(DemoApplication.class, args);
//
// }
//
// ToolRunner 와 비슷하다
// @Override
// public void run(String... arg0) throws Exception {
// //제어 쿼리
// log.info("############################");
// log.info("# DemoApplication.run()... #");
// log.info("############################");
// log.info(dao.selectAll().toString());
// }
// }
