import java.util.*;

abstract class Person {
    protected String id;
    protected String name;
    protected String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}

interface Enrollable {
    void enrollInCourse(Course course);
}

interface Teachable {
    void assignCourse(Course course);
}

class Student extends Person implements Enrollable {
    private List<Course> enrolledCourses;

    public Student(String id, String name, String email) {
        super(id, name, email);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println("Student " + name + " enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println(c.getCourseName());
        }
    }
}

class Professor extends Person implements Teachable {
    private String department;
    private List<Course> assignedCourses;

    public Professor(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
        this.assignedCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setProfessor(this);
    }

    public void showAssignedCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Course c : assignedCourses) {
            System.out.println(c.getCourseName());
        }
    }
}

class Course {
    private String courseId;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
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

public class q12 {
    public static void main(String[] args) {
        Student student1 = new Student("S101", "Alice", "alice@email.com");
        Professor professor1 = new Professor("P201", "Dr. Smith", "smith@email.com", "Mathematics");
        Course course1 = new Course("C301", "Math 101");
        professor1.assignCourse(course1);
        student1.enrollInCourse(course1);
        course1.showCourseDetails();
        student1.showEnrolledCourses();
        professor1.showAssignedCourses();
    }
}

