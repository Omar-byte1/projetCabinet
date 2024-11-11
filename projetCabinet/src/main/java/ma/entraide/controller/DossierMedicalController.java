package ma.Cabinet.controller;
import java.util.List;

import ma.Cabinet.entity.DossierMedical;
import ma.Cabinet.service.DossierMedicalService;

public class DossierMedicalController {

    private DossierMedicalService dossierMedicalService;
    private DossierMedicalService dossierService = new DossierMedicalService();

    public DossierMedicalController() {
        dossierMedicalService = new DossierMedicalService();
    }
    public DossierMedical getDossierById(int id) {
        return dossierService.getDossierById(id);
    }

    public List<DossierMedical> getAllDossiers() {
        return dossierService.getAllDossiers();
    }

    public void addDossier(DossierMedical dossier) {
        dossierService.addDossier(dossier);
    }

    public void updateDossier(DossierMedical dossier) {
        dossierService.updateDossier(dossier);
    }

    public void deleteDossier(int id) {
        dossierService.deleteDossier(id);
    }
}
