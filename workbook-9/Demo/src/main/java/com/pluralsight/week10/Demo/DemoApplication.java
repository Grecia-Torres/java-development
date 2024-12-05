package com.pluralsight.week10.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pluralsight.week10.Demo")
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
	}
}
