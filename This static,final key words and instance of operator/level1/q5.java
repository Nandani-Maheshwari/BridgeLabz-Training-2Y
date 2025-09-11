class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name          : " + name);
            System.out.println("Roll Number   : " + rollNumber);
            System.out.println("Grade         : " + grade);
            System.out.println("University    : " + universityName);
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not a Student object.");
        }
    }

    void updateGrade(char newGrade) {
        if (this instanceof Student) {
            grade = newGrade;
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 'A');
        Student s2 = new Student("Bob", 102, 'B');

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s2.updateGrade('A');
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}

