class Bird {
    void fly() {
        System.out.println("This bird can fly.");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("The sparrow flies swiftly.");
    }
}

public class q3 {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();
    }
}

