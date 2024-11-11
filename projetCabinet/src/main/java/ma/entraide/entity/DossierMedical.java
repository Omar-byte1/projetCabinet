package ma.Cabinet.entity;
import java.util.List;
public class DossierMedical {
    private int idDossier;
    private Patient patient;
    private List<Consultation> historiqueConsultations;
    private List<Rv> historiqueRendezVous;
    private List<Facture> factures;

    public DossierMedical(int idDossier, Patient patient,
                          List<Consultation> historiqueConsultations,
                          List<Rv> historiqueRendezVous,
                          List<Facture> factures) {
        this.idDossier = idDossier;
        this.patient = patient;
        this.historiqueConsultations = historiqueConsultations;
        this.historiqueRendezVous = historiqueRendezVous;
        this.factures = factures;
    }

    public int getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(int idDossier) {
        this.idDossier = idDossier;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Consultation> getHistoriqueConsultations() {
        return historiqueConsultations;
    }

    public void setHistoriqueConsultations(List<Consultation> historiqueConsultations) {
        this.historiqueConsultations = historiqueConsultations;
    }

    public List<Rv> getHistoriqueRendezVous() {
        return historiqueRendezVous;
    }

    public void setHistoriqueRendezVous(List<Rv> historiqueRendezVous) {
        this.historiqueRendezVous = historiqueRendezVous;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

}
