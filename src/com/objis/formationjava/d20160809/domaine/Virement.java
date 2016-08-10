package com.objis.formationjava.d20160809.domaine;

/**
 * Classe permettant de créer des objets Virement.
 * <p>
 * Un Virement est composée de 3 nombres: l'identifiant du compte débiteur, l'identifiant du compte crédité, le montant du virement.
 * 
 * @author Guillaume et Vincent
 */
public class Virement {

    private long idCompteDebiteur;
    private long idCompteRecepteur;
    private double montant;


    public Virement(long idCompteDebiteur, long idCompteRecepteur, double montant) {
        this.idCompteDebiteur = idCompteDebiteur;
        this.idCompteRecepteur = idCompteRecepteur;
        this.montant = montant;
    }

    public long getIdCompteDebiteur() {
        return idCompteDebiteur;
    }

    public long getIdCompteRecepteur() {
        return idCompteRecepteur;
    }

    public double getMontant() {
        return montant;
    }

    public boolean isThisConcernCompte(CompteBanquaire compteBanquaire){
        if (compteBanquaire.getNumCompte() == idCompteDebiteur || compteBanquaire.getNumCompte() == idCompteRecepteur){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Virement)) return false;

        Virement virement = (Virement) o;

        if (idCompteDebiteur != virement.idCompteDebiteur) return false;
        if (idCompteRecepteur != virement.idCompteRecepteur) return false;
        return Double.compare(virement.montant, montant) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (idCompteDebiteur ^ (idCompteDebiteur >>> 32));
        result = 31 * result + (int) (idCompteRecepteur ^ (idCompteRecepteur >>> 32));
        temp = Double.doubleToLongBits(montant);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Virement{" +
                "idCompteDebiteur=" + idCompteDebiteur +
                ", idCompteRecepteur=" + idCompteRecepteur +
                ", montant=" + montant +
                '}';
    }
}
