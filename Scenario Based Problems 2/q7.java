import java.util.*;

interface ICourseActions {
    void enrollCourse(Course course);
    void dropCourse(Course course);
}

abstract class Person {
    private String name;
    private String email;
    private String id;

    public Person(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public abstract void printDetails();
}

class Student extends Person implements ICourseActions {
    private List<Course> courses;
    private Map<Course, Double> grades;

    public Student(String name, String email, String id) {
        super(name, email, id);
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
        grades.remove(course);
    }

    public void assignGrade(Course course, double grade) {
        if (courses.contains(course)) {
            grades.put(course, grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        double total = 0;
        for (double g : grades.values()) {
            total += g;
        }
        return total / grades.size();
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + getName() + ", GPA: " + calculateGPA());
    }
}

class Faculty extends Person {
    private List<Course> courses;

    public Faculty(String name, String email, String id) {
        super(name, email, id);
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setFaculty(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty: " + getName() + ", Courses: " + courses.size());
    }
}

class Course {
    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public String getCourseName() {
        return courseName;
    }
}

public class q7 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Sharma", "sharma@uni.edu", "F01");
        Course c1 = new Course("OOP");
        f1.assignCourse(c1);

        Student s1 = new Student("Anita", "anita@uni.edu", "S01");
        Student s2 = new Student("Ravi", "ravi@uni.edu", "S02");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        s1.assignGrade(c1, 8.5);
        s2.assignGrade(c1, 9.2);

        s1.printDetails();
        s2.printDetails();
        f1.printDetails();
    }
}

