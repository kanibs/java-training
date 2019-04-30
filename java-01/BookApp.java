import java.util.Date;
class BookApp{
	
	public static void main(String... args) {
		Book nullBook = new Book();
		System.out.println("Null Book Details");
		// nullBook.displayBookDetails();

		Book hp = new Book();
		Class klass = hp.getClass();
		System.out.println("---------------------HP:"+klass);

		System.out.println("HP Book Details");
			
		hp.author = "Rowling";
		hp.name = "Harry Potter";
		hp.publisher = "TMH";
		hp.publishedOn = new Date();
		// hp.displayBookDetails();

		System.out.println("Total Books created:"+ Book.counter);
	}
}