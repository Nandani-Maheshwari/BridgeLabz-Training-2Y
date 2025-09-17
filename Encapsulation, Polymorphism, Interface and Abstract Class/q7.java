import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: " + calculateBill());
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("P001", "Alice", 30, 5, 2000);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-surgery recovery");

        OutPatient outPatient = new OutPatient("P002", "Bob", 40, 500);
        outPatient.addRecord("Routine checkup");
        outPatient.addRecord("Prescribed medication");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient p : patients) {
            p.getPatientDetails();
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("---------------------------");
        }
    }
}

