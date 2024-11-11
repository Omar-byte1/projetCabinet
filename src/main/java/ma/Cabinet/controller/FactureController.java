package ma.Cabinet.controller;


import ma.Cabinet.entity.Facture;
import ma.Cabinet.service.FactureService;
import java.util.List;

public class FactureController {
    private FactureService factureService;
    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }
    public List<Facture> getFactures() {
        return factureService.getFactures();
    }
    public Facture getFacture(int id) {
        return factureService.getFacture(id);
    }
    public List<Facture> getAllFactures() {
        return factureService.getAllFactures();
    }

    public void addFacture(Facture facture) {
        factureService.addFacture(facture);
    }

    public void updateFacture(Facture facture) {
        factureService.updateFacture(facture);
    }

    public void deleteFacture(int id) {
        factureService.deleteFacture(id);
    }

}
