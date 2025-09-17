import java.util.*;

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name + " (Grade: " + grade + ")";
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}

class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name + " (Dept: " + department + ")";
    }
}

public class q2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "A");
        Student student2 = new Student("Bob", "B");
        Professor professor1 = new Professor("Dr. Smith", "Mathematics");
        Course course1 = new Course("Math 101");
        course1.assignProfessor(professor1);
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        course1.showDetails();
    }
}

