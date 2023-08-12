package com.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class ActuatorExampleApplication {
	
    public static void main(String[] args) {SpringApplication.run(ActuatorExampleApplication.class, args);
        System.out.printf("Hello and welcome!"); 
        for (int i = 1; i <= 5; i++) {        
        System.out.println("i = " + i);
        }
    }
}