package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
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
}
