class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("----------------------------");
    }
}

public class q4 {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayDetails();

        HotelBooking booking2 = new HotelBooking("Alice Johnson", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        booking2.displayDetails();

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking:");
        booking3.displayDetails();
    }
}

