package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreBackendApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(BookstoreBackendApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
