/**
 * Book
 */

import java.util.UUID;

public class Book {

	private String title;
	private int pages;
	private boolean rented;
	private UUID id;

	public Book(String title, int pages) {

		this.title = title;
		this.pages = pages;
		this.id = UUID.randomUUID();
		this.rented = false;
		
	}

}