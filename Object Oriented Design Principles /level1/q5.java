import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department d : departments) {
            System.out.println(d.getDeptName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculties in " + universityName + ":");
        for (Faculty f : faculties) {
            System.out.println(f.getName());
        }
    }

    public void deleteUniversity() {
        departments.clear();
        faculties.clear();
        System.out.println(universityName + " is deleted along with all its departments.");
    }
}

public class q5 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");
        University uni = new University("Tech University");
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");
        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.showDepartments();
        uni.showFaculties();
        uni.deleteUniversity();
        System.out.println("Faculty " + f1.getName() + " still exists independently.");
    }
}

