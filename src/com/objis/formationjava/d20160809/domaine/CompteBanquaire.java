package com.objis.formationjava.d20160809.domaine;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class CompteBanquaire {

    private long numCompte;
    private double solde;
    private LocalDateTime dateOuverture;
    private List<Virement> historiqueVirements;


    public CompteBanquaire(long numCompte, LocalDateTime dateOuverture) {
        this.numCompte = numCompte;
        this.dateOuverture = dateOuverture;
        solde = 0.0;
        historiqueVirements = new ArrayList<>();
    }

    public CompteBanquaire(long numCompte, double solde, LocalDateTime dateOuverture) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        historiqueVirements = new ArrayList<>();
    }


    public void ajouterMontant(double montant){
        solde += montant;
    }

    public void retirerMontant(double montant){
        solde -= montant;
    }


    public boolean ajouterVirement(Virement virement){

        //Test si le virement est bien pour ce compte
        if(virement.isThisConcernCompte(this)){
            historiqueVirements.add(virement);
            return true;
        }else{
            return false;
        }

    }


    public long getNumCompte() {
        return numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public LocalDateTime getDateOuverture() {
        return dateOuverture;
    }

    public List<Virement> getHistoriqueVirements() {
        return historiqueVirements;
    }
}
