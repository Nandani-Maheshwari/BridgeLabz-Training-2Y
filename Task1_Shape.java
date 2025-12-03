// File: Task1_Shape.java
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
    public double perimeter() { return 2 * Math.PI * r; }
}

class Rectangle implements Shape {
    private double w, h;
    public Rectangle(double w, double h) { this.w = w; this.h = h; }
    public double area() { return w * h; }
    public double perimeter() { return 2 * (w + h); }
}

public class Task1_Shape {
    public static void main(String[] args) {
        Shape c = new Circle(3.0);
        Shape r = new Rectangle(4.0, 5.0);

        System.out.printf("Circle: area=%.2f, perimeter=%.2f%n", c.area(), c.perimeter());
        System.out.printf("Rectangle: area=%.2f, perimeter=%.2f%n", r.area(), r.perimeter());
    }
}
