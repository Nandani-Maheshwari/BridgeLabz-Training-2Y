import java.util.*;

class Student {
    private String id;
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        System.out.println(name + " requests enrollment in " + course.getCourseName());
        if (!course.isFull()) {
            course.addStudent(this);
            enrolledCourses.add(course);
            System.out.println(name + " successfully enrolled in " + course.getCourseName());
        } else {
            System.out.println(course.getCourseName() + " is full. Enrollment failed for " + name);
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseId;
    private String courseName;
    private List<Student> students = new ArrayList<>();
    private int maxCapacity;

    public Course(String id, String name, int maxCapacity) {
        this.courseId = id;
        this.courseName = name;
        this.maxCapacity = maxCapacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to " + courseName);
    }

    public boolean isFull() {
        return students.size() >= maxCapacity;
    }
}

public class q17 {
    public static void main(String[] args) {
        Course course = new Course("C101", "Physics", 2);
        Student student1 = new Student("S101", "Alice");
        Student student2 = new Student("S102", "Bob");
        Student student3 = new Student("S103", "Charlie");

        student1.enrollInCourse(course);
        student2.enrollInCourse(course);
        student3.enrollInCourse(course);
    }
}

