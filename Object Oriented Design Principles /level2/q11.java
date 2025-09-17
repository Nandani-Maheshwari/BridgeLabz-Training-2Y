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

class Student_John extends Person implements Enrollable {
    private List<Course> enrolledCourses;

    public Student_John(String id, String name, String email) {
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

class Student_Alice extends Person implements Enrollable {
    private List<Course> enrolledCourses;

    public Student_Alice(String id, String name, String email) {
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

class Professor_MrSmith extends Person implements Teachable {
    private String department;
    private List<Course> assignedCourses;

    public Professor_MrSmith(String id, String name, String email, String department) {
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

class Course_Math101 extends Course {
    public Course_Math101(String courseId, String courseName) {
        super(courseId, courseName);
    }
}

class Course {
    private String courseId;
    private String courseName;
    private Professor_MrSmith professor;
    private List<Person> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor_MrSmith professor) {
        this.professor = professor;
    }

    public void addStudent(Person student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Students:");
        for (Person s : students) {
            System.out.println(s.getName());
        }
    }
}

class University_Tech {
    private String universityName;
    private List<Course> courses;

    public University_Tech(String universityName) {
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

public class q11 {
    public static void main(String[] args) {
        University_Tech university_Tech = new University_Tech("Tech University");
        Student_John student_John = new Student_John("S101", "John", "john@email.com");
        Student_Alice student_Alice = new Student_Alice("S102", "Alice", "alice@email.com");
        Professor_MrSmith professor_MrSmith = new Professor_MrSmith("P201", "Mr. Smith", "smith@email.com", "Mathematics");
        Course_Math101 course_Math101 = new Course_Math101("C301", "Math 101");
        university_Tech.addCourse(course_Math101);
        professor_MrSmith.assignCourse(course_Math101);
        student_John.enrollInCourse(course_Math101);
        student_Alice.enrollInCourse(course_Math101);
        university_Tech.showUniversityCourses();
        course_Math101.showCourseDetails();
        student_John.showEnrolledCourses();
        professor_MrSmith.showAssignedCourses();
    }
}
