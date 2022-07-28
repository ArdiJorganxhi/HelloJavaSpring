package com.example.ardijorganxhi.springfirst.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){

        return args -> {
            Student ardi =new Student(1, "Ardi", "Jorganxhi", LocalDate.of(2000, Month.JUNE,14), "ardijorganxhi@gmail.com");


            Student ahmet =new Student(2, "Ahmet", "Jorganxhi", LocalDate.of(1991, Month.JUNE,14), "ahmetjorganxhi@gmail.com");
            studentRepository.saveAll(List.of(ardi, ahmet));


        };


    }
}
