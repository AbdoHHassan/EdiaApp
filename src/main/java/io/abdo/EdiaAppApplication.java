package io.abdo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.abdo.EdiaApp.Text.TextController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TextController.class)

public class EdiaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdiaAppApplication.class, args);
	}
}
