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
        System.out.println(name + " sends request to enroll in " + course.getCourseName());
        course.addStudent(this);
        enrolledCourses.add(course);
        System.out.println("Enrollment confirmed for " + name + " in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String id;
    private String name;
    private List<Course> assignedCourses = new ArrayList<>();

    public Professor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void assignCourse(Course course) {
        System.out.println(name + " assigns course " + course.getCourseName());
        assignedCourses.add(course);
        course.setProfessor(this);
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseId;
    private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Course " + courseName + " now taught by " + professor.getName());
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " added to course " + courseName);
    }
}

public class q15 {
    public static void main(String[] args) {
        Professor prof = new Professor("P101", "Dr. John");
        Course course = new Course("C101", "Physics");
        Student student = new Student("S101", "Alice");

        prof.assignCourse(course);
        student.enrollInCourse(course);
    }
}

