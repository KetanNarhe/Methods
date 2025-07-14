//Non Static methos Program...
package com.methods;

public class BookDriver {

	public static void main(String[] args) {
		
		
		Book b1=new Book();
		
		b1.brand="ClassMate";
		b1.price=150;
		b1.page=200;
		b1.type="A4";
		b1.size="Ruled";
		
		b1.displayBook();
		
        Book b2=new Book();
		
		b2.brand="Kamlin";
		b2.price=180;
		b2.page=300;
		b2.type="A4";
		b2.size="Ruled";
		
		b2.displayBook();
	}

}
