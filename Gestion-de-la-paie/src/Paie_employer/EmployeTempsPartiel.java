package Paie_employer;

/**
 * Created by HAMALI on 25/10/16.
 */
public class EmployeTempsPartiel extends Employe {
    private double montantHeure;
    final int heure = 35;

    public double getMontantHeure() {
        return montantHeure;
    }

    public void setMontantHeure(double montantHeure) {
        this.montantHeure = montantHeure;
    }


    public EmployeTempsPartiel(String nom, String job) {
        super(nom, job);

    }

    @Override
    public double calculerPaie() {
        setSalaire((montantHeure * heure));
        return getSalaire();
    }
}
