
/**
 * Book
 */

import java.util.UUID;

public class Book {

	private String title;
	private int pages;
	private UUID id;

	public Book(String title, int pages) {

		this.title = title;
		this.pages = pages;
		this.id = UUID.randomUUID();

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

	public UUID getId() {
		return this.id;
	}


	@Override
	public String toString() {
		String book;
		book = String.format("\nTitle: %s\nPages: %s", getTitle(), getPages());
		return book;
	}

}