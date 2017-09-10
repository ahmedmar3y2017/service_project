package com.example.demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.example.demo.Entities.User;
import com.example.demo.service.Login_Service;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner {
	// @Autowired
	// Login_Service login_Service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	@Override
	public void run(String... args) throws Exception {

//		User user = login_Service.get("ahmedmar3y108@gmail.com", "123456");
//
//		System.out.println("Done    " + user.getPassword());

	}
}
