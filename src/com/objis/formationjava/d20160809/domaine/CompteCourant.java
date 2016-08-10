package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class CompteCourant extends CompteBanquaire {

    private double decouvertAutorise;

    public CompteCourant(long numCompte, LocalDateTime dateOuverture) {
        super(numCompte, dateOuverture);
        init();
    }

    public CompteCourant(long numCompte, double solde, LocalDateTime dateOuverture) {
        super(numCompte, solde, dateOuverture);
        init();
    }

    private void init(){
        decouvertAutorise = 1000;
    }


    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompteCourant)) return false;
        if (!super.equals(o)) return false;

        CompteCourant that = (CompteCourant) o;

        return Double.compare(that.decouvertAutorise, decouvertAutorise) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(decouvertAutorise);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                ", numCompte=" + getNumCompte()+
                ", solde=" + getSolde()+
                ", dateOuverture=" + getDateOuverture()+
                ", historiqueVirements=" + getHistoriqueVirements()+
                "decouvertAutorise=" + getDecouvertAutorise()+
                '}';
    }
}
