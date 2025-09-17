
import java.util.*;

class Result {
    private String grade;

    public Result(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return "grade:" + grade;
    }
}

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
        System.out.println("courseName:" + courseName);
        if (professor != null) {
            System.out.println("professor:" + professor.getName());
        }
        for (Student s : students) {
            System.out.println("student:" + s.getName() + ", " + s.getResult().getGrade());
        }
    }
}

class Student {
    private String name;
    private Result result;

    public Student(String name, Result result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return "name:" + name;
    }

    public Result getResult() {
        return result;
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return "name:" + name;
    }
}

public class q4 {
    public static void main(String[] args) {
        Result result1 = new Result("A");
        Result result2 = new Result("B");
        Student student1 = new Student("Alice", result1);
        Student student2 = new Student("Bob", result2);
        Professor professor1 = new Professor("Dr. Smith");
        Course course1 = new Course("Math 101");
        course1.assignProfessor(professor1);
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        course1.showDetails();
    }
}
