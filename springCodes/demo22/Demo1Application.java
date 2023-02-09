package com.example22.demo22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //tell the compiler that it'sa sb project
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Demo1Application.class, args);
//		Home h = new Home();
		Home h = ctxt.getBean(Home.class);
		h.connect();
	}

}
