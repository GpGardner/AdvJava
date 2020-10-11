public class Main {

	public static void main(String[] args) {

		Library libraryOne = new Library("123 Main Street", "Monday through Friday 9a to 5pm");
		Library libraryTwo = new Library("456 Orchard Way", "Monday through Friday 9a to 5pm");
		Customer customerOne = new Customer("George Gardner");

		System.out.println("\n"+libraryOne.getAddress()+ " " +libraryOne.getHours());
		System.out.println("\n"+libraryTwo.getAddress()+ " " +libraryTwo.getHours());
		Book bookOne = new Book("Harry Potter", 500);
		Book bookTwo = new Book("Harry Potter2", 400);
		Book bookThree = new Book("Harry Potter3", 200);
		Book bookFour = new Book("Harry Potter4", 600);
		Book bookFive = new Book("Harry Potter5", 800);

		customerOne.getRentedBooks();
		

		System.out.println(libraryOne.addBook(bookOne));
		System.out.println(libraryOne.addBook(bookTwo));
		System.out.println(libraryOne.addBook(bookThree));
		System.out.println(libraryOne.addBook(bookFour));
		System.out.println(libraryOne.addBook(bookFive));
		libraryOne.getBooks();
		customerOne.rentBook(bookOne, libraryOne);
		customerOne.rentBook(bookTwo, libraryOne);
		customerOne.getRentedBooks();
		libraryOne.getBooks();

				

	}

}
