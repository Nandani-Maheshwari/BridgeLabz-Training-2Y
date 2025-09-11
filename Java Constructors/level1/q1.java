class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class q1 {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("Default Constructor Book:");
        defaultBook.displayDetails();

        Book paramBook = new Book("The Alchemist", "Paulo Coelho", 399.99);
        System.out.println("\nParameterized Constructor Book:");
        paramBook.displayDetails();
    }
}

