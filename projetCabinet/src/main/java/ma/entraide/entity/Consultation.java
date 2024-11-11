package ma.Cabinet.entity;
import java.util.Date;
import java.util.List;
public class Consultation {
    private int idConsultation;
    private Date date;
    private Patient patient;
    private List<Act> actes;
    private String notes;
    public Consultation(int idConsultation, Date date, Patient patient,
                        List<Act> actes, String notes) {
        this.idConsultation = idConsultation;
        this.date = date;
        this.patient = patient;
        this.actes = actes;
        this.notes = notes;
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Act> getActes() {
        return actes;
    }

    public void setActes(List<Act> actes) {
        this.actes = actes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
