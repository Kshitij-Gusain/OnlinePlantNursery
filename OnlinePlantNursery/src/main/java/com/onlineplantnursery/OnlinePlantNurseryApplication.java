package com.onlineplantnursery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//	netstat -ano | findstr :8080
//	taskkill /PID 0000 /F

@SpringBootApplication
public class OnlinePlantNurseryApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlinePlantNurseryApplication.class, args);
	}
}
