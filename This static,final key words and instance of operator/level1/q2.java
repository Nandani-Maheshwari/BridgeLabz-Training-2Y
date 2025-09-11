class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + isbn);
            System.out.println("Library: " + libraryName);
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not a Book object.");
        }
    }
}
public class q2 {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book book2 = new Book("1984", "George Orwell", "ISBN002");
        Book.displayLibraryName();
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}

