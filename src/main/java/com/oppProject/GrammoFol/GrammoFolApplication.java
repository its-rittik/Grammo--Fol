package com.oppProject.GrammoFol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class GrammoFolApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrammoFolApplication.class, args);
	}

}
