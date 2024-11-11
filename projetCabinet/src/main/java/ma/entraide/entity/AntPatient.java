package ma.Cabinet.entity;
import java.util.Date;
import java.util.List;

public class AntPatient {
    private int idAntecedant;
    private String type;
    private String description;
    private Date dateDiagnose;
    private String status;
    private Patient patient;
    private List<AntPatient> antPatients;
    public AntPatient() {

    }
    public AntPatient(int idAntecedant, String type, String description,
                             Date dateDiagnose, String status, Patient patient) {
        this.idAntecedant = idAntecedant;
        this.type = type;
        this.description = description;
        this.dateDiagnose = dateDiagnose;
        this.status = status;
        this.patient = patient;
    }
    public int getIdAntecedant() {
        return idAntecedant;
    }
    public void setIdAntecedant(int idAntecedant) {
        this.idAntecedant = idAntecedant;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {

    }
    public Date getDateDiagnose() {
        return dateDiagnose;
    }
    public void setDateDiagnose(Date dateDiagnose) {
        this.dateDiagnose = dateDiagnose;
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
    public List<AntPatient> getAntPatients() {
        return antPatients;
    }
    public void setAntPatients(List<AntPatient> antPatients) {
        this.antPatients = antPatients;
    }

}
