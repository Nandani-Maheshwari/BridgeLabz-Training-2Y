import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

interface Reservable {
    void reserveItem(String borrowerName, String borrowerContact);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrowerName;
    private String borrowerContact;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrowerName = borrowerName;
            this.borrowerContact = borrowerContact;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrowerName;
    private String borrowerContact;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrowerName = borrowerName;
            this.borrowerContact = borrowerContact;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrowerName;
    private String borrowerContact;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrowerName = borrowerName;
            this.borrowerContact = borrowerContact;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

public class q5 {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        LibraryItem book = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("M201", "Tech Monthly", "Editorial Team");
        LibraryItem dvd = new DVD("D301", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.checkAvailability()) {
                    r.reserveItem("Alice", "alice@example.com");
                }
            }
            System.out.println("---------------------------");
        }
    }
}

