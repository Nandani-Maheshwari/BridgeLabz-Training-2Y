class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------------");
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class q3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        System.out.println("Vehicles before updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("Vehicles after updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

