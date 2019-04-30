import java.util.*;
class Book{

	
	int counter = 0;
	String author;
	String name;
	String publisher;
	Date publishedOn;

	Book(){
		counter++;
	}

	public void displayBookDetails(){
		int x =10;
		System.out.println("Title of the Book:"+name);
		System.out.println("Author of the Book:"+author);
		System.out.println("publisher of the Book:"+publisher);
		System.out.println("publishedOn :"+publishedOn);
	}
}