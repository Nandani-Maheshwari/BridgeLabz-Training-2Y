class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void display() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", ID: " + studentId);
    }
}

public class q7 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20, "S123");
        s.display();
    }
}

