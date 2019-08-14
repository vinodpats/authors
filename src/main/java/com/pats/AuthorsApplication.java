package com.pats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pats.model.QuoteService;

@SpringBootApplication
public class AuthorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorsApplication.class, args);
	}

	@Bean
	public QuoteService getQuoteService() {
		return new QuoteService();
	}
}
