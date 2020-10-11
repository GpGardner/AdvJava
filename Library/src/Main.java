public class Main {

	public static void main(String[] args) {

		Library libraryOne = new Library("123 Main Street", "Monday through Friday 9a to 5pm");
		Library libraryTwo = new Library("456 Orchard Way", "Monday through Friday 9a to 5pm");

		System.out.println("\n"+libraryOne.getAddress()+ " " +libraryOne.getHours());
		System.out.println("\n"+libraryTwo.getAddress()+ " " +libraryTwo.getHours());

		System.out.println(libraryOne.addBooks(new Book("Harry Potter", 500)));
		System.out.println(libraryOne.getBooks());

	}

}
