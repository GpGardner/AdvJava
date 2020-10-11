import java.util.ArrayList;

public class Library {

	
	private ArrayList<Book> books = new ArrayList<>();
	private String address;
	private String hours;
	
	public Library(String address, String hours) {
		this.address = address;
		this.hours = hours;
	}

	public String getBooks() {
		for (Book book : books) {
			return book.toString();
		}

		return "No books currently available";
	}

	public String addBooks(Book book) {
		books.add(book);
		// String newBook = String.format("Book: %s, has been added", book.getTitle());
		return "Book Added";
	}

	public int rentBook(Book book) {

		if(books.contains(book)){
			return 0;
		}

		return 0;
		
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHours() {
		return this.hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}
	
	
	
	


}
