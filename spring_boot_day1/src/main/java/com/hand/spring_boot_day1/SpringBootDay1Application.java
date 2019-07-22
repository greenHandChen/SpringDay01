package com.hand.spring_boot_day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication

public class SpringBootDay1Application {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootDay1Application.class, args);
	}

}
