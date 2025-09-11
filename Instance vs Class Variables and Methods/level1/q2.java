class Course {
    private String courseName;
    private int duration; 
    private double fee;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("----------------------------");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class q2 {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Web Development", 4, 12000);

        System.out.println("Courses before updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        System.out.println("Courses after updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

