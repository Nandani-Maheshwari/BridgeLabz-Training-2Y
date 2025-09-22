interface IRideService {
    void bookRide(String pickup, String drop, double distance);
    void endRide();
}

abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateFare(double distance);
}

class Mini extends Vehicle {
    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Mini");
    }

    @Override
    public double calculateFare(double distance) {
        return 50 + distance * 10;
    }
}

class Sedan extends Vehicle {
    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Sedan");
    }

    @Override
    public double calculateFare(double distance) {
        return 100 + distance * 15;
    }
}

class SUV extends Vehicle {
    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "SUV");
    }

    @Override
    public double calculateFare(double distance) {
        return 150 + distance * 20;
    }
}

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRating() {
        return rating;
    }
}

class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private String pickup;
    private String drop;
    private double distance;
    private double fare;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(String pickup, String drop, double distance) {
        this.pickup = pickup;
        this.drop = drop;
        this.distance = distance;
        this.fare = vehicle.calculateFare(distance);
        System.out.println("Ride booked with " + driver.getName() + " in a " + vehicle.getType());
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Fare: " + fare);
    }

    public double getFare() {
        return fare;
    }
}

public class q5 {
    public static void main(String[] args) {
        Vehicle v1 = new Sedan("MH12AB1234", 4);
        Driver d1 = new Driver("Arjun", "DL12345", 4.8);

        RideService ride = new RideService(v1, d1);
        ride.bookRide("Station", "Airport", 12.5);
        ride.endRide();
    }
}

