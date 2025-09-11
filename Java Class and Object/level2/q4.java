import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        MovieTicket ticket = new MovieTicket(movie);
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();
        ticket.bookTicket(seat, price);
        ticket.displayDetails();
        sc.close();
    }
}

