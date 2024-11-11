package ma.Cabinet.entity;
import java.sql.Time;
import java.util.Date;
public class Rv {
    private int id;
    private int idRv;
    private Date date;
    private Time heure;
    private Patient patient;
    private Consultation consultation;

    public Rv(int idRv, Date date, Time heure, Patient patient, Consultation consultation) {
        this.idRv = idRv;
        this.date = date;
        this.heure = heure;
        this.patient = patient;
        this.consultation = consultation;
    }

    public int getIdRv() {
        return idRv;
    }

    public void setIdRv(int idRv) {
        this.idRv = idRv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
