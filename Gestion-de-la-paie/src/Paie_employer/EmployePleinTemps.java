package Paie_employer;

/**
 * Created by HAMALI on 25/10/16.
 */
public class EmployePleinTemps extends Employe {
    private double montantheb;
    private double prime;

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public double getMontantheb() {

        return montantheb;
    }

    public void setMontantheb(double montantheb) {
        this.montantheb = montantheb;
    }

    public EmployePleinTemps(String nom, String job
    ) {
        super(nom, job);

    }

    @Override
    public double calculerPaie() {
        setSalaire((montantheb*4+prime));
        return getSalaire();
    }
}
