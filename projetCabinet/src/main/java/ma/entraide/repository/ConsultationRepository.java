package ma.Cabinet.repository;

import ma.Cabinet.entity.Consultation;
import java.util.List;
import ma.Cabinet.service.ConsultationService;



public interface ConsultationRepository {

    public List<Consultation> getConsultations();
    public Consultation getConsultation(int id);
    public Consultation saveConsultation(Consultation consultation);
    public void deleteConsultation(int id);
    public void updateConsultation(Consultation consultation);
    public List<Consultation> getConsultationsByDate(String date);
    public List<Consultation>   FindallConsultations();

}
