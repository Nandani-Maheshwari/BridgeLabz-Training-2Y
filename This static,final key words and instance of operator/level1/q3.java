class Employee {
    static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID  : " + id);
            System.out.println("Designation  : " + designation);
            System.out.println("Company      : " + companyName);
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not an Employee object.");
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Manager");
        Employee emp2 = new Employee("Bob", 102, "Developer");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}

