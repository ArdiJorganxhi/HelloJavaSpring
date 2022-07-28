package com.example.ardijorganxhi.springfirst;

import com.example.ardijorganxhi.springfirst.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class SpringfirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfirstApplication.class, args);
	}



}
