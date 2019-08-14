package com.pats.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class QuoteService {
	private List<Quote> quotes = new ArrayList<Quote>();
	
	public QuoteService() {
		this.quotes.add(new Quote("We write to taste life twice, in the moment and in retrospect", "Anaïs Nin"));
		this.quotes.add(new Quote("If you don't have time to read, you don't have the time (or the tools) to write. Simple as that", "Stephen King"));
		this.quotes.add(new Quote("One day I will find the right words, and they will be simple", "Jack Kerouac"));
		this.quotes.add(new Quote("The most valuable of all talents is that of never using two words when one will do", "Thomas Jefferson"));
	}
	
	public Quote getQuote() {
		Random rm = new Random();
		int num = rm.nextInt(this.quotes.size());
		return this.quotes.get(num);
		
	}
	
	public void addQuote(Quote quote) {
		this.quotes.add(quote);
		return;
		
	}
	
	public List<Quote> getQuotes() {
		return this.quotes;
		
	}
}

