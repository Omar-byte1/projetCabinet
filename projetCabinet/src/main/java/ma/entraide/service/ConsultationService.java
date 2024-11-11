package ma.Cabinet.service;
import ma.Cabinet.entity.Consultation;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;


public class ConsultationService {
    private static Map<Integer, Consultation> consultations = new HashMap<>();
    private static int idCounter = 1;
    public Optional<Consultation> getConsultationById(int id) {
        return consultations.values().stream()
                .filter(consultation -> consultation.getIdConsultation() == id)
                .findFirst();
    }

    public List<Consultation> getAllConsultations() {

        return null;
    }

    public void addConsultation(Consultation consultation) {
        consultation.setIdConsultation(idCounter++);
        consultations.put(consultation.getIdConsultation(), consultation);
    }

    public void updateConsultation(Consultation consultation) {
        consultations.put(consultation.getIdConsultation(), consultation);
    }

    public void deleteConsultation(int id) {
        consultations.remove(id);

    }
    public List<Consultation> FindAllConsultations( int id ) {
        return null;

    }

}
