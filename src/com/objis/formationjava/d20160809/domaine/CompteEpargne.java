package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class CompteEpargne extends CompteBanquaire {

    private double tauxRemuneration;


    public CompteEpargne(long numCompte, LocalDateTime dateOuverture) {
        super(numCompte, dateOuverture);
        init();
    }

    public CompteEpargne(long numCompte, double solde, LocalDateTime dateOuverture) {
        super(numCompte, solde, dateOuverture);
        init();
    }

    private void init(){
        tauxRemuneration = 0.03;
    }


    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompteEpargne)) return false;
        if (!super.equals(o)) return false;

        CompteEpargne that = (CompteEpargne) o;

        return Double.compare(that.tauxRemuneration, tauxRemuneration) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(tauxRemuneration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                ", numCompte=" + getNumCompte()+
                ", solde=" + getSolde()+
                ", dateOuverture=" + getDateOuverture()+
                ", historiqueVirements=" + getHistoriqueVirements()+
                ", tauxRemuneration=" + tauxRemuneration +
                '}';
    }


    @Override
    public String alternateToString() {
        return "CompteEpargne{" +
                ", numCompte=" + getNumCompte()+
                ", solde=" + getSolde()+
                ", dateOuverture=" + getDateOuverture()+
                ", tauxRemuneration=" + tauxRemuneration +
                '}';
    }
}
