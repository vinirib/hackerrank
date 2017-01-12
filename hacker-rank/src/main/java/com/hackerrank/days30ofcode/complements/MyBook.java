package com.hackerrank.days30ofcode.complements;

public class MyBook extends Book {

	private int price;
	MyBook(String t, String a, int p) {
		super(t, a);
		this.price = p;
	}

	@Override
	void display() {
		System.out.println("Title: " +super.title+
				"\nAuthor: "+super.author+"\nPrice: "+price);
		
	}

}
