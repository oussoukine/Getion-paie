class Gestion{

public static void main(String args[]){
Employe ep[] = new Employe[3];
        ep[0] = new Employe("kadour", "pdg");
        ep[1] = new EmployeTempsPartiel("adam", "cuisinier");
        ep[2] = new EmployePleinTemps("haouari", "plombier");

        ep[0].setSalaire(2500);
        System.out.print(ep[0].afficheCheque());
        System.out.print("=================");
        ((EmployeTempsPartiel) ep[1]).setMontantHeure(2500);
        ((EmployeTempsPartiel) ep[1]).calculerPaie();
        System.out.print(ep[1].afficheCheque());
        System.out.print("================");
        ((EmployePleinTemps) ep[2]).setMontantheb(2500);
        ((EmployePleinTemps) ep[2]).setPrime(500);
        ((EmployePleinTemps) ep[2]).calculerPaie();
        System.out.print(ep[2].afficheCheque());
}

}
