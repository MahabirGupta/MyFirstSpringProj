package com.example.FirstProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {

//		create a context
		ConfigurableApplicationContext context =SpringApplication.run(FirstProjApplication.class, args);
//		creating the object of Alien class
		Alien alien = context.getBean(Alien.class);
		alien.show();

		Alien alien1 = context.getBean(Alien.class);
		alien1.show();


		System.out.println("Welcome to boot...");

	}

}
