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

class Professor {
    private String id;
    private String name;
    private List<Course> assignedCourses = new ArrayList<>();

    public Professor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void assignCourses(List<Course> courses) {
        System.out.println(name + " starts assigning courses");
        for (Course course : courses) {
            assignedCourses.add(course);
            course.setProfessor(this);
            System.out.println(name + " assigned to " + course.getCourseName());
        }
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
    private int maxCapacity;

    public Course(String id, String name, int maxCapacity) {
        this.courseId = id;
        this.courseName = name;
        this.maxCapacity = maxCapacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(courseName + " is now taught by " + professor.getName());
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to " + courseName);
    }

    public boolean isFull() {
        return students.size() >= maxCapacity;
    }
}

public class q16 {
    public static void main(String[] args) {
        Professor prof = new Professor("P101", "Dr. John");
        Course course1 = new Course("C101", "Physics", 2);
        Course course2 = new Course("C102", "Chemistry", 1);
        List<Course> courses = Arrays.asList(course1, course2);

        prof.assignCourses(courses);

        Student student1 = new Student("S101", "Alice");
        Student student2 = new Student("S102", "Bob");
        Student student3 = new Student("S103", "Charlie");

        student1.enrollInCourse(course1);
        student2.enrollInCourse(course1);
        student3.enrollInCourse(course1);

        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);
    }
}

