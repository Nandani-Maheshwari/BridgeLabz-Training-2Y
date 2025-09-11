class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("----------------------------");
    }
}

public class q5 {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 299.99, true);
        Book b2 = new Book("1984", "George Orwell", 399.50, false);

        System.out.println("Library Books:");
        b1.displayDetails();
        b2.displayDetails();

        b1.borrowBook();
        b2.borrowBook();

        System.out.println("\nAfter Borrowing:");
        b1.displayDetails();
        b2.displayDetails();
    }
}

