import java.util.*;

interface IDiscountable {
    double applyDiscount();
}

class Book implements IDiscountable {
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    protected void updateStock(int quantity) {
        stock -= quantity;
        if(stock < 0) stock = 0;
    }

    @Override
    public double applyDiscount() {
        return getPrice();
    }
}

class EBook extends Book {
    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * 0.9;
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * 0.95;
    }
}

class Order {
    private String user;
    private Map<Book, Integer> books;
    private String status;

    public Order(String user) {
        this.user = user;
        this.books = new HashMap<>();
        this.status = "Pending";
    }

    public void addBook(Book book, int quantity) {
        if(book.getStock() >= quantity) {
            books.put(book, quantity);
            book.updateStock(quantity);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for(Map.Entry<Book, Integer> entry : books.entrySet()) {
            total += entry.getKey().applyDiscount() * entry.getValue();
        }
        return total;
    }

    protected void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

public class q13 {
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Programming", "Author A", 500, 100);
        PrintedBook pbook = new PrintedBook("Data Structures", "Author B", 700, 50);

        Order order1 = new Order("Alice");
        order1.addBook(ebook, 2);
        order1.addBook(pbook, 1);

        System.out.println("Order Total: " + order1.calculateTotal());
        order1.updateStatus("Shipped");
        System.out.println("Order Status: " + order1.getStatus());
    }
}

