class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }
}

public class q2 {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.display();

        Circle customCircle = new Circle(5.5);
        System.out.println("\nCustom Circle:");
        customCircle.display();
    }
}

