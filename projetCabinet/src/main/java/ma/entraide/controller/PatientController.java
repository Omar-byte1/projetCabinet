package ma.Cabinet.controller;
import java.util.List;
import ma.Cabinet.entity.Patient;
import ma.Cabinet.service.PatientService;
import java.util.Scanner;
import java.util.stream.Stream;


public class PatientController {

    private final PatientService patientService;
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    public Stream<Patient> getPatient(int id) {
        return patientService.getPatientById(id);
    }


    public Stream<Patient> getPatientById(int id) {
        return patientService.getPatientById(id);
    }

    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    public void addPatient(Patient patient) {
        patientService.addPatient(patient);
    }

    public void updatePatient(Patient patient) {
        patientService.updatePatient(patient);
    }

    public void deletePatient(int id) {
        patientService.deletePatient(id);
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name:");
        String name = scanner.nextLine();
        System.out.println("Enter patient age:");
        int age = scanner.nextInt();

        Patient patient = new Patient(name, age);
        patientService.registerPatient(patient);

        System.out.println("Patient registered successfully!");
    }
}

