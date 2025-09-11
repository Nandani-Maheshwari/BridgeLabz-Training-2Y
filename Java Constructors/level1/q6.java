class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("----------------------------");
    }
}

public class q6 {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental:");
        rental1.displayDetails();

        CarRental rental2 = new CarRental("John Doe", "SUV", 5, 2000.0);
        System.out.println("Custom Rental:");
        rental2.displayDetails();
    }
}

