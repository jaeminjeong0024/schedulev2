package com.example.schedulev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Schedulev2Application {

    public static void main(String[] args) {
        SpringApplication.run(Schedulev2Application.class, args);
    }

}
