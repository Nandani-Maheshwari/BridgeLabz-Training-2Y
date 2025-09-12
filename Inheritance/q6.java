class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting...");
    }
}

public class q6 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}

