package com.newman.sim.taskAmigo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskAmigoApplication {

    private static final Logger log = LoggerFactory.getLogger(TaskAmigoApplication.class);
    public static void main(String[] args) {

		SpringApplication.run(TaskAmigoApplication.class, args);
		log.info("taskAmigo is good to go!");
    }

}
