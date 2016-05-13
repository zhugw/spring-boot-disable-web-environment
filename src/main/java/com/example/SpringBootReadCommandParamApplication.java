package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReadCommandParamApplication implements CommandLineRunner{
	@Value("${foo}")
	private String foo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReadCommandParamApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(foo);
		
	}
}
