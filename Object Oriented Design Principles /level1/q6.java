import java.util.*;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println(d.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println(d.getName());
        }
    }

    public void showPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

public class q6 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Adams");
        Doctor d2 = new Doctor("Dr. Brown");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        hospital.showDoctors();
        hospital.showPatients();
        d1.showPatients();
        d2.showPatients();
        p1.showDoctors();
        p2.showDoctors();
    }
}

