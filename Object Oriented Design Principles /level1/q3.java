import java.util.*;

class Employee {
    private String employeeId;
    private String employeeName;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName);
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empId, String empName) {
        employees.add(new Employee(empId, empName));
    }

    public void showDepartmentDetails() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployeeDetails();
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
        System.out.println("-------------------------");
    }

    public void closeCompany() {
        departments.clear();
        System.out.println("Company " + companyName + " is closed. All departments and employees are removed.");
    }
}

public class q3 {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        Department dept1 = new Department("IT");
        dept1.addEmployee("E101", "Alice");
        dept1.addEmployee("E102", "Bob");

        Department dept2 = new Department("HR");
        dept2.addEmployee("E201", "Charlie");
        dept2.addEmployee("E202", "Diana");

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.showCompanyDetails();

        company.closeCompany();
    }
}

