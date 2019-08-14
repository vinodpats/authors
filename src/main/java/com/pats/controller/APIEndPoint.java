package com.pats.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pats.model.Quote;
import com.pats.model.QuoteService;

@RestController
public class APIEndPoint {

	private QuoteService quoteService;
	
	public APIEndPoint(QuoteService quoteService) {
		this.quoteService = quoteService;
	}
	@RequestMapping("/quote")
	public Quote getQuote() {
			return(this.quoteService.getQuote());
		
	}
	
	@RequestMapping("/quotes")
	public List<Quote> getQuotes() {
			return(this.quoteService.getQuotes());
		
	}
	
	@RequestMapping(value="/quote", method=RequestMethod.POST)
	public void addQuote(@RequestBody Quote quote) {
		this.quoteService.addQuote(quote);
	}
	
	
	@RequestMapping(value="/quote", method=RequestMethod.DELETE)
	public void deleteQuote(@RequestBody Quote quote) {
		this.quoteService.getQuotes().remove(quote);
	}
	
	
}
