class Vehicle {
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor: " + brand);
    }

    final void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
        System.out.println("Car constructor: " + model);
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

public class q13 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");
        c.displayBrand();
        c.displayModel();
    }
}
