import java.util.*;

class Course {
    private String courseId;
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getProfessorName());
        }
        for (Student s : enrolledStudents) {
            System.out.println("Student: " + s.getStudentName() + ", ID: " + s.getStudentId());
        }
    }
}

class Student {
    private String studentId;
    private String studentName;
    private String email;

    public Student(String studentId, String studentName, String email) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }
}

class Professor {
    private String professorId;
    private String professorName;
    private String department;

    public Professor(String professorId, String professorName, String department) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.department = department;
    }

    public String getProfessorId() {
        return professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getDepartment() {
        return department;
    }
}

public class q7 {
    public static void main(String[] args) {
        Student student1 = new Student("S101", "Alice", "alice@email.com");
        Student student2 = new Student("S102", "Bob", "bob@email.com");
        Professor professor1 = new Professor("P201", "Dr. Smith", "Mathematics");
        Course course1 = new Course("C301", "Math 101");
        course1.assignProfessor(professor1);
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.showCourseDetails();
    }
}
