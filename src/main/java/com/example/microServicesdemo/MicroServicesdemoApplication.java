package com.example.microServicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroServicesdemoApplication {

	@GetMapping("/")
	public String welcome(){
		return "Hii shivam ";	
	}
			
	@GetMapping("/{input}")
	public String main(@PathVariable String input){
		return "Hii "+input+" your application Deployed Successfull !!!!!!!!!";	
	}	
			
			
	public static void main(String[] args) {
		SpringApplication.run(MicroServicesdemoApplication.class, args);
	}

}
