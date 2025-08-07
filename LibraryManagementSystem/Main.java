public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));

        // Register users
        library.registerUser(new User("Abhishek", 101));
        library.registerUser(new User("Riya", 102));

        System.out.println("All Books:");
        library.showAllBooks();

        // Issue book
        library.issueBook("1984");

        // Show books again
        System.out.println("\nAfter issuing:");
        library.showAllBooks();

        // Return book
        library.returnBook("1984");

        // Final book list
        System.out.println("\nAfter returning:");
        library.showAllBooks();
    }
}
