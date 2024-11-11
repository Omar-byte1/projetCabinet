package ma.Cabinet.entity;
import java.util.Date;
import java.util.List;
public class SituationFinancier {
    private int id;
    private int idSF;
    private double totalDue;
    private double totalPaid;
    private double balance;
    private Date lastPaymentDate;
    private Patient patient;
    private List<Facture> invoices;
    public SituationFinancier(int idSF, double totalDue, double totalPaid,
                               double balance, Date lastPaymentDate,
                               Patient patient, List<Facture> invoices) {
        this.idSF = idSF;
        this.totalDue = totalDue;
        this.totalPaid = totalPaid;
        this.balance = balance;
        this.lastPaymentDate = lastPaymentDate;
        this.patient = patient;
        this.invoices = invoices;
    }

    public int getIdSF() {
        return idSF;
    }

    public void setIdSF(int idSF) {
        this.idSF = idSF;
    }

    public double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(double totalDue) {
        this.totalDue = totalDue;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Facture> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Facture> invoices) {
        this.invoices = invoices;
    }
}
