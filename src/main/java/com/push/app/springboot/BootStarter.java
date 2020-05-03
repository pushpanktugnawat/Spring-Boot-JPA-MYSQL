/*
 *  Copyright (c) 2020 Andree Hagelstein, Maik Schulze, Deutsche Telekom AG. All Rights Reserved.
 *  
 *  Filename: BootStarter.java
 */
package com.push.app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class BootStarter.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class BootStarter {

	/**
	 * The main method.
	 * this method does instantiate boot application
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) 
	{
		SpringApplication.run(BootStarter.class, args);	

	}

}
