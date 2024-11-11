package ma.Cabinet.entity;
import java.util.Date;
import java.util.List;

public class InterventionMed {
    private int idIntervention;
    private String typeIntervention;
    private Date dateIntervention;
    private List<Integer> dentsConcernees;
    private String description;
    private double cost;
    private Patient patient;

    public InterventionMed(int idIntervention, String typeIntervention,
                                Date dateIntervention, List<Integer> dentsConcernees,
                                String description, double cost, Patient patient) {
        this.idIntervention = idIntervention;
        this.typeIntervention = typeIntervention;
        this.dateIntervention = dateIntervention;
        this.dentsConcernees = dentsConcernees;
        this.description = description;
        this.cost = cost;
        this.patient = patient;
    }

    public int getIdIntervention() {
        return idIntervention;
    }

    public void setIdIntervention(int idIntervention) {
        this.idIntervention = idIntervention;
    }

    public String getTypeIntervention() {
        return typeIntervention;
    }

    public void setTypeIntervention(String typeIntervention) {
        this.typeIntervention = typeIntervention;
    }

    public Date getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(Date dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    public List<Integer> getDentsConcernees() {
        return dentsConcernees;
    }

    public void setDentsConcernees(List<Integer> dentsConcernees) {
        this.dentsConcernees = dentsConcernees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
