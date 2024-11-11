package ma.Cabinet.service;

import ma.Cabinet.entity.Patient;
import java.util.List;
import java.util.ArrayList ;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;

import static java.util.Locale.filter;


public class PatientService {

    private List<Patient> patients = new ArrayList<>();

    public Stream<Patient> getPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {

                return Stream.of(patient);
            }else {
                System.out.println("Patient not found");
            }

        }


return patients.stream().filter(patient -> patient.getId() == id);
    }


    public List<Patient> getAllPatients() {


        return new ArrayList<>(patients);
    }

    public void addPatient(Patient patient) {

    }

    public void updatePatient(Patient patient) {

    }

    public void deletePatient(int id) {

    }

    public void registerPatient(Patient patient) {

    }
}
