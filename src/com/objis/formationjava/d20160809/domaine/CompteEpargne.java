package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Classe  permettant de creer les objets Comptes epargnes. Les comptes epargnes sont définis par: leur numéros de compte (long),
 * <p>
 * leur solde (double), leur date d'ouverture et un historique des virement ainsi que par le taux de rémunération du compte;
 * 
 * @author Guillaume et Vincent
 */
public class CompteEpargne extends CompteBanquaire {

    private double tauxRemuneration;

    /**
     * Constructeur de compte epargnes à partir d'un numero de compte et d'une date d'ouverture de compte.
     * <p>
     * le solde est initialisé par défaut à 0, l'historique comme étant un Arraylist vide et le taux de rémunération à 3%;
     * @param numCompte numero de compte assigné au compte
     * @param dateOuverture date d'ouverture du compte
     */
    public CompteEpargne(long numCompte, LocalDateTime dateOuverture) {
        super(numCompte, dateOuverture);
        init();
    }
    
    /**
     * Constructeur de compte epargnes à partir d'un numero de compte et d'une date d'ouverture de compte et d'un solde.
     * <p>
     *  l'historique est initialisé comme étant un Arraylist vide et le taux de rémunération à 3%;
     * @param numCompte numero de compte assigné au compte
     * @param dateOuverture date d'ouverture du compte
     */
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
        return "\tCompteEpargne{" +
                ", numCompte=" + getNumCompte()+
                ", solde=" + getSolde()+
                ", dateOuverture=" + getDateOuverture()+
                ", tauxRemuneration=" + tauxRemuneration +
                '}';
    }
}
