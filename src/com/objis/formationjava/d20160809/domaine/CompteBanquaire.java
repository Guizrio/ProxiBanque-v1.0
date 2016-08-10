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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompteBanquaire)) return false;

        CompteBanquaire that = (CompteBanquaire) o;

        if (numCompte != that.numCompte) return false;
        if (Double.compare(that.solde, solde) != 0) return false;
        if (dateOuverture != null ? !dateOuverture.equals(that.dateOuverture) : that.dateOuverture != null)
            return false;
        return historiqueVirements != null ? historiqueVirements.equals(that.historiqueVirements) : that.historiqueVirements == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (numCompte ^ (numCompte >>> 32));
        temp = Double.doubleToLongBits(solde);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateOuverture != null ? dateOuverture.hashCode() : 0);
        result = 31 * result + (historiqueVirements != null ? historiqueVirements.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CompteBanquaire{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                ", dateOuverture=" + dateOuverture +
                ", historiqueVirements=" + historiqueVirements +
                '}';
    }


    public String alternateToString() {
        return "CompteBanquaire{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                ", dateOuverture=" + dateOuverture +
                '}';
    }

}
