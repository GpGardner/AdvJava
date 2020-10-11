
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
		setRented(false);

	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return this.pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public boolean getRented() {
		return this.rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	public UUID getId() {
		return this.id;
	}

	// public void setId(UUID id) {
	// this.id = id;
	// }

	@Override
	public String toString() {
		String book;
		if (this.rented == true) {
			book = String.format("\nTitle: " + getTitle() + "\nPages: " + getPages() + "\nRental Status: Currently Rented\n");
		} else {
			book = String
					.format("\nTitle: " + getTitle() + "\nPages: " + getPages() + "\nRental Status: Currently Available\n");

		}

		return book;
	}

}