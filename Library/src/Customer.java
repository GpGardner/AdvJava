import java.util.ArrayList;

public class Customer {

	private String name;
	public ArrayList<Book> rentedBooks = new ArrayList<Book>();


	public Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getRentedBooks() {
		if (rentedBooks.size() > 0) {
			System.out.printf("\n%s is currently renting: \n", name);
			rentedBooks.forEach((book) -> System.out.println(book.getTitle()));
		} else {
			System.out.printf("\n%s, currently doesn't have any books rented\n", name);
		}
	}

	public void rentBook(Book book, Library library){
		library.rentBook(book.getId(), this);
		System.out.printf("\n%s: has been successfully rented\n", book.getTitle());
	}

	public String returnBook(Book book, Library library){
		return library.returnBook(book, this);
	}


}
