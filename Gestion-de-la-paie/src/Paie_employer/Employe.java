package Paie_employer;

/**
 * Created by HAMALI on 25/10/16.
 */
public class Employe {
    private String nom;
    private String fonct;
    private double salaire;

    public Employe(String nom, String fonct, double salaire) {
        this.nom = nom;
        this.fonct = fonct;
        this.salaire = salaire;


    }


    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getFonct() {

        return fonct;
    }

    public void setFonct(String fonct) {
        this.fonct = fonct;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
