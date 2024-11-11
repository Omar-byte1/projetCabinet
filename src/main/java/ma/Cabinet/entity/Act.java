package ma.Cabinet.entity;

public class Act {
    private int idActe;
    private String typeActe;
    private String description;
    private double cost;
    private Consultation consultation;

    public Act(int idActe, String typeActe, String description, double cost, Consultation consultation) {
        this.idActe = idActe;
        this.typeActe = typeActe;
        this.description = description;
        this.cost = cost;
        this.consultation = consultation;
    }

    public int getIdActe() {
        return idActe;
    }

    public void setIdActe(int idActe) {
        this.idActe = idActe;
    }

    public String getTypeActe() {
        return typeActe;
    }

    public void setTypeActe(String typeActe) {
        this.typeActe = typeActe;
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

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
