class Vehicle {
    static double registrationFee = 100.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name         : " + ownerName);
            System.out.println("Vehicle Type       : " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee   : $" + registrationFee);
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not a Vehicle object.");
        }
    }
}

public class q6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "REG101");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle", "REG102");

        Vehicle.updateRegistrationFee(150.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

