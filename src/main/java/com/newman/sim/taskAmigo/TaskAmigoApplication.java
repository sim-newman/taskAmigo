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
		System.out.println("System is up");
    }

        @Bean
        public CommandLineRunner demo(TaskRepository repository) {
            return (args) -> {
                // save a few tasks
                repository.save(new Task("Meeting", "1 to 1 Animesh"));
                repository.save(new Task("Meeting", "1 to 1 Simon"));

                // fetch all customers
                log.info("Tasks found with findAll():");
                log.info("-------------------------------");
                for (Task task : repository.findAll()) {
                    log.info(task.toString());
                }
                log.info("");


            };

        }





}
