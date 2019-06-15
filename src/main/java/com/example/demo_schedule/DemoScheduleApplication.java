package com.example.demo_schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoScheduleApplication.class, args);
    }

}
