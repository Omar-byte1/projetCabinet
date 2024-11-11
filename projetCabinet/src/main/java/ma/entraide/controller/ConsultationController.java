package ma.Cabinet.controller;

import ma.Cabinet.entity.Consultation;
import ma.Cabinet.service.ConsultationService;
import java.util.List;
import java.util.Optional;


public class ConsultationController {
    private ConsultationService consultationService = new ConsultationService();

    public Optional<Consultation> getConsultationById(int id) {
        return consultationService.getConsultationById(id);
    }

    public List<Consultation> getAllConsultations() {
        return consultationService.getAllConsultations();
    }

    public void addConsultation(Consultation consultation) {
        consultationService.addConsultation(consultation);
    }

    public void updateConsultation(Consultation consultation) {
        consultationService.updateConsultation(consultation);
    }

    public void deleteConsultation(int id) {
        consultationService.deleteConsultation(id);
    }
}


