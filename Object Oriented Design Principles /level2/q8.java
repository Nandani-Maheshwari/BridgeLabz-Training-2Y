import java.util.*;

class Person {
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

class Student extends Person {
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

class Professor extends Person {
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

class University {
    private String universityName;
    private List<Course> courses;

    public University(String universityName) {
        this.universityName = universityName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showUniversityCourses() {
        System.out.println("Courses offered by " + universityName + ":");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}

public class q8 {
    public static void main(String[] args) {
        University university = new University("Tech University");
        Student student1 = new Student("S101", "Alice", "alice@email.com");
        Student student2 = new Student("S102", "Bob", "bob@email.com");
        Professor professor1 = new Professor("P201", "Dr. Smith", "smith@email.com", "Mathematics");
        Course course1 = new Course("C301", "Math 101");
        university.addCourse(course1);
        professor1.assignCourse(course1);
        student1.enrollInCourse(course1);
        student2.enrollInCourse(course1);
        university.showUniversityCourses();
        course1.showCourseDetails();
        student1.showEnrolledCourses();
        professor1.showAssignedCourses();
    }
}

