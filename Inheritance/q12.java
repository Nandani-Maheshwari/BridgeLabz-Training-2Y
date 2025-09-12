class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
}

public class q12 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}

