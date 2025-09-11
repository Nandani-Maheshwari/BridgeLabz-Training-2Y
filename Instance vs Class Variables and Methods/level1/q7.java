class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------------");
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department); 
        System.out.println("Salary (via getter): " + getSalary());
        System.out.println("Team Size: " + teamSize);
        System.out.println("----------------------------");
    }
}

public class q7 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 60000.0);
        e1.displayDetails();
        e1.setSalary(65000.0);
        System.out.println("Updated Salary: " + e1.getSalary());

        Manager m1 = new Manager(201, "HR", 90000.0, 10);
        m1.displayManagerDetails();
    }
}

