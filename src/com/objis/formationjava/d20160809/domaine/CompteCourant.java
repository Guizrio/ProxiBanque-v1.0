package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Classe  permettant de creer les objets Comptes courants. Les comptes courants sont définis par: leur numéros de compte (long),
 * <p>
 * leur solde (double), leur date d'ouverture et un historique des virement ainsi que par le découvert autorisé sur le compte;
 * 
 * @author Guillaume et Vincent
 */
public class CompteCourant extends CompteBanquaire {

    private double decouvertAutorise;

    /**
     * Constructeur de compte bancaire à partir d'un numero de compte et d'une date d'ouverture de compte.
     * <p>
     * le solde est initialisé par défaut à 0, l'historique comme étant un Arraylist vide et le découvert autorisé à 1000;
     * @param numCompte numero de compte assigné au compte
     * @param dateOuverture date d'ouverture du compte
     */
    public CompteCourant(long numCompte, LocalDateTime dateOuverture) {
        super(numCompte, dateOuverture);
        init();
    }

    /**
     * Constructeur de compte bancaire à partir d'un numero de compte et d'une date d'ouverture de compte et d'un solde.
     * <p>
     *  l'historique est initialisé comme étant un Arraylist vide et le découvert autorisé à 1000;
     * @param numCompte numero de compte assigné au compte
     * @param dateOuverture date d'ouverture du compte
     */
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
                ", decouvertAutorise=" + getDecouvertAutorise()+
                '}';
    }

    @Override
    public String alternateToString() {
        return "CompteCourant{" +
                ", numCompte=" + getNumCompte()+
                ", solde=" + getSolde()+
                ", dateOuverture=" + getDateOuverture()+
                ", decouvertAutorise=" + getDecouvertAutorise()+
                '}';
    }
}
