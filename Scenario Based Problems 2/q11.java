import java.util.*;

interface IInteractable {
    void feed();
    void play();
    void sleep();
}

abstract class Pet implements IInteractable {
    private String name;
    private String type;
    private int age;
    private int hunger;
    private int mood;
    private int energy;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = new Random().nextInt(50);
        this.mood = new Random().nextInt(50);
        this.energy = new Random().nextInt(50);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    protected void changeHunger(int value) {
        hunger += value;
        if(hunger < 0) hunger = 0;
        if(hunger > 100) hunger = 100;
    }

    protected void changeMood(int value) {
        mood += value;
        if(mood < 0) mood = 0;
        if(mood > 100) mood = 100;
    }

    protected void changeEnergy(int value) {
        energy += value;
        if(energy < 0) energy = 0;
        if(energy > 100) energy = 100;
    }

    public abstract void makeSound();

    @Override
    public void feed() {
        changeHunger(-20);
        changeMood(10);
        changeEnergy(5);
    }

    @Override
    public void play() {
        changeMood(15);
        changeHunger(10);
        changeEnergy(-10);
    }

    @Override
    public void sleep() {
        changeEnergy(20);
        changeMood(5);
        changeHunger(5);
    }
}

class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof Woof!");
    }
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow Meow!");
    }
}

class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet Tweet!");
    }
}

public class q11 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Misty", 2);
        Bird bird = new Bird("Tweety", 1);

        dog.feed();
        cat.play();
        bird.sleep();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

