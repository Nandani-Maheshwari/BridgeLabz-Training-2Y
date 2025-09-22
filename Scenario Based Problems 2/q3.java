import java.util.*;

interface Rentable {
    double calculateRent(int days);
}

abstract class Vehicle implements Rentable {
    protected String model;
    protected double baseRate;

    public Vehicle(String model, double baseRate) {
        this.model = model;
        this.baseRate = baseRate;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRate() {
        return baseRate;
    }
}

class Bike extends Vehicle {
    public Bike(String model, double baseRate) {
        super(model, baseRate);
    }

    public double calculateRent(int days) {
        return baseRate * days;
    }
}

class Car extends Vehicle {
    public Car(String model, double baseRate) {
        super(model, baseRate);
    }

    public double calculateRent(int days) {
        double surcharge = days > 5 ? 200 : 0;
        return (baseRate * days) + surcharge;
    }
}

class Truck extends Vehicle {
    public Truck(String model, double baseRate) {
        super(model, baseRate);
    }

    public double calculateRent(int days) {
        double discount = days > 7 ? 0.9 : 1.0;
        return (baseRate * days) * discount;
    }
}

class Customer {
    private String name;
    private List<String> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void rentVehicle(Vehicle v, int days) {
        double cost = v.calculateRent(days);
        rentals.add(v.getModel() + " for " + days + " days, Cost: " + cost);
    }

    public void showRentals() {
        for (String r : rentals) {
            System.out.println(r);
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        Vehicle bike = new Bike("Hero", 300);
        Vehicle car = new Car("Hyundai", 1200);
        Vehicle truck = new Truck("Volvo", 2500);

        Customer c = new Customer("Raj");
        c.rentVehicle(bike, 3);
        c.rentVehicle(car, 6);
        c.rentVehicle(truck, 10);

        c.showRentals();
    }
}
