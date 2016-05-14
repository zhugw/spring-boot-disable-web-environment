package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {EmbeddedServletContainerAutoConfiguration.class, WebMvcAutoConfiguration.class})
//@SpringBootApplication(exclude = {SpringDataWebAutoConfiguration.class})
public class SpringBootDisableWebEnvironmentApplication implements CommandLineRunner{
	
	
	public static void main(String[] args) {
//		new SpringApplication().setWebEnvironment(false);
		SpringApplication.run(SpringBootDisableWebEnvironmentApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("hello");
	}
}
