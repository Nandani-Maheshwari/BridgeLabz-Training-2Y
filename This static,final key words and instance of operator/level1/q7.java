class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Name : " + name);
            System.out.println("Patient ID   : " + patientID);
            System.out.println("Age          : " + age);
            System.out.println("Ailment      : " + ailment);
            System.out.println("Hospital     : " + hospitalName);
            System.out.println("-----------------------------");
        } else {
            System.out.println("This is not a Patient object.");
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Flu", 101);
        Patient p2 = new Patient("Bob", 45, "Fracture", 102);

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}

