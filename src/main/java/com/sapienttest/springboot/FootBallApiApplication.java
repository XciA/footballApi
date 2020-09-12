package com.sapienttest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("ALL")
@SpringBootApplication
@ComponentScan({"com.sapienttest.springboot"})
@EnableScheduling
public class FootBallApiApplication {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(FootBallApiApplication.class, args);
    }


}
