import java.util.ArrayList;
import java.util.UUID;

public class Library {

	
	private ArrayList<Book> books = new ArrayList<Book>();
	private String address;
	private String hours;
	
	public Library(String address, String hours) {
		this.address = address;
		this.hours = hours;
	}

	public void getBooks() {
		if (books.size() > 0) {
			System.out.println("\nHere is our current selection: \n");
			books.forEach((book) -> {
				if(!book.getRented()){
					System.out.println(book.getTitle());
				}
			});
		} else {
			System.out.println("No books available");
		}
		
	}

	public String addBook(Book book) {
		books.add(book);
		final String recipt = String.format("\n%s\nHas been successfully added\nCurrent Stock: %s", book.toString(), books.size());
		return recipt;
	}

	public String rentBook(UUID rentalBook) {
		
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getId() == rentalBook && !book.getRented()){
				book.setRented(true);
				final String recipt = String.format("\n%s\nHas been successfully rented!", book.toString());
				return recipt;
			}
		}
		return "\nSorry that book isn't available right now.";
		
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
