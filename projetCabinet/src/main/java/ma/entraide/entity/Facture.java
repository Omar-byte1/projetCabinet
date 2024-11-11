package ma.Cabinet.entity;
import java.util.Date;
import java.util.List;


public class Facture {
    private int idFacture;
    private Date dateFacture;
    private double total;
    private String status;
    private Patient patient;
    private Consultation consultation;

    public Facture(int idFacture, Date dateFacture,
                   double total, String status, Patient patient,
                   Consultation consultation) {
        this.idFacture = idFacture;
        this.dateFacture = dateFacture;

        this.total = total;
        this.status = status;
        this.patient = patient;
        this.consultation = consultation;
    }

    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }





    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
