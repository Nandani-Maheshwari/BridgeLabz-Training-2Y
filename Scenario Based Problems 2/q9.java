import java.util.*;

interface ICertifiable {
    void generateCertificate();
}

abstract class User {
    private String name;
    private String email;
    private String userId;

    public User(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public abstract void displayDetails();
}

class Learner extends User {
    private List<Quiz> completedQuizzes;

    public Learner(String name, String email, String userId) {
        super(name, email, userId);
        completedQuizzes = new ArrayList<>();
    }

    public void completeQuiz(Quiz quiz) {
        completedQuizzes.add(quiz);
    }

    @Override
    public void displayDetails() {
        System.out.println("Learner: " + getName() + ", Completed Quizzes: " + completedQuizzes.size());
    }
}

class Instructor extends User {
    private List<Course> courses;

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void displayDetails() {
        System.out.println("Instructor: " + getName() + ", Courses: " + courses.size());
    }
}

class Quiz {
    private String title;
    private List<String> questions;
    private Map<String, String> answers;
    private int score;

    public Quiz(String title, List<String> questions, Map<String, String> answers) {
        this.title = title;
        this.questions = new ArrayList<>(questions);
        this.answers = new HashMap<>(answers);
        this.score = 0;
    }

    public int takeQuiz(Map<String, String> responses) {
        score = 0;
        for (String q : responses.keySet()) {
            if (answers.containsKey(q) && answers.get(q).equals(responses.get(q))) {
                score++;
            }
        }
        return score;
    }

    public double getPercentage() {
        return (double) score / questions.size() * 100;
    }

    public String getTitle() {
        return title;
    }
}

abstract class Course implements ICertifiable {
    private String courseName;
    private List<Quiz> quizzes;

    public Course(String courseName) {
        this.courseName = courseName;
        quizzes = new ArrayList<>();
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public String getCourseName() {
        return courseName;
    }
}

class ShortCourse extends Course {
    public ShortCourse(String name) {
        super(name);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate for completing short course: " + getCourseName());
    }
}

class FullTimeCourse extends Course {
    public FullTimeCourse(String name) {
        super(name);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate for completing full-time course: " + getCourseName());
    }
}

public class q9 {
    public static void main(String[] args) {
        Learner learner = new Learner("Riya", "riya@example.com", "L001");
        Instructor instructor = new Instructor("Dr. Khan", "khan@example.com", "I001");

        ShortCourse sc = new ShortCourse("Java Basics");
        FullTimeCourse ftc = new FullTimeCourse("Advanced Java");

        Map<String, String> answers = new HashMap<>();
        answers.put("Q1", "A");
        answers.put("Q2", "B");
        List<String> questions = Arrays.asList("Q1", "Q2");

        Quiz quiz1 = new Quiz("Java Quiz", questions, answers);
        sc.addQuiz(quiz1);

        Map<String, String> responses = new HashMap<>();
        responses.put("Q1", "A");
        responses.put("Q2", "B");

        learner.completeQuiz(quiz1);
        quiz1.takeQuiz(responses);

        learner.displayDetails();
        instructor.addCourse(ftc);
        instructor.displayDetails();

        sc.generateCertificate();
        ftc.generateCertificate();
        System.out.println("Quiz Percentage: " + quiz1.getPercentage() + "%");
    }
}
