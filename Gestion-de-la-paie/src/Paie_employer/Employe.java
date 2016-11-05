package Paie_employer;

/**
 * Created by HAMALI on 25/10/16.
 */
public class Employe {


    private String nom;
    private String job;
    private double salaire;

    public Employe(String nom, String job) {

        this.nom = nom;
        this.job = job;


    }

    public double calculerPaie() {
        return salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getJob() {

        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

public void afficheCheque(){
    system.out.println("payer à l'ordre de"+non+"("fonction)"***+salaire;

    
    }
}

