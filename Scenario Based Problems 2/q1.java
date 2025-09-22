interface Payable {
    double calculatePayment();
}

class Patient {
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = "Normal Admission";
    }

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Name: " + name + ", Age: " + age + ", History: " + medicalHistory;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

class InPatient extends Patient {
    private int roomNumber;

    public InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public InPatient(String name, int age, String medicalHistory, int roomNumber) {
        super(name, age, medicalHistory);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Room: " + roomNumber);
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    public OutPatient(String name, int age, String medicalHistory, String appointmentDate) {
        super(name, age, medicalHistory);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Appointment: " + appointmentDate);
    }
}

class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}

class Bill implements Payable {
    private double baseAmount;
    private double discount;
    private double tax;

    public Bill(double baseAmount, double discount, double tax) {
        this.baseAmount = baseAmount;
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculatePayment() {
        double discounted = baseAmount - (baseAmount * discount);
        double total = discounted + (discounted * tax);
        return total;
    }
}

public class q1 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");
        Patient p1 = new InPatient("Raj", 45, "Emergency Admission", 101);
        Patient p2 = new OutPatient("Anita", 30, "Normal Checkup", "2025-09-25");

        d1.displayInfo();
        p1.displayInfo();
        p2.displayInfo();

        Bill b1 = new Bill(10000, 0.1, 0.05);
        System.out.println("Total Bill: " + b1.calculatePayment());
    }
}

