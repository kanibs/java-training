import java.util.*;
class Book{

	String author ;
	String name ;
	String publisher ;
	Date publishedOn;

	Book(String a , String n , String p){
		author = a;
		name = n;
		publisher = p;
		publishedOn = new Date();
	}

	public void displayBookDetails(){
		int x =10;
		System.out.println("Title of the Book:"+name);
		System.out.println("Author of the Book:"+author);
		System.out.println("publisher of the Book:"+publisher);
		System.out.println("publishedOn :"+publishedOn);
	}


	public static void main(String[] args) {

		Book b1 = new Book("author1" , "name1" , "pub1");
		Book b2 = new Book("author2" , "name2" , "pub2");
		Book b3 = new Book("author3" , "name3" , "pub3");
		Book [] books = {b1, b2, b3};

		for(Book v : books){
			v.displayBookDetails();
			System.out.println("-----------------------");
		}
		
	}
}