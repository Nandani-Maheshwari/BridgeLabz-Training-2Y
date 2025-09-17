import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println("-------------------------");
    }
}

public class q1 {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Design Patterns", "Erich Gamma");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(book1);
        lib1.addBook(book2);

        lib2.addBook(book2);
        lib2.addBook(book3);

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}

