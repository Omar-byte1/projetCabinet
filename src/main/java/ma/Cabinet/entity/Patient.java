package ma.Cabinet.entity;
import java.util.Date;
import java.util.List;

public class Patient {
    private int id;
    private String CIN;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String email;
    private String sexe;
    private List<AntPatient> antecedants;
    private String age;

    public Patient(String CIN, String nom, String prenom, Date dateNaissance,
                   String adresse, String telephone, String email,
                   String sexe, List<AntPatient> antecedants, String age ,int id) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.sexe = sexe;
        this.antecedants = antecedants;
        this.age = age;
        this.id = id;
    }

    public Patient(String name, int age) {
    }

    // Getters and Setters
    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public List<AntPatient> getAntecedants() {
        return antecedants;
    }

    public void setAntecedants(List<AntPatient> antecedants) {
        this.antecedants = antecedants;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}
