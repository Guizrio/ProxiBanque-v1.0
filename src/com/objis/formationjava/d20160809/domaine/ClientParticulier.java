package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ClientParticulier extends Client{

    private String prenom;


    public ClientParticulier(String nom, String prenom) {
        super(nom);
        this.prenom = prenom;
    }

    public ClientParticulier(String nom, String prenom, Adresse adresse, String telephone) {
        super(nom, adresse, telephone);
        this.prenom = prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public double getMaxDebit() {
        return 5000.0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientParticulier)) return false;
        if (!super.equals(o)) return false;

        ClientParticulier that = (ClientParticulier) o;

        return prenom != null ? prenom.equals(that.prenom) : that.prenom == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nClientParticulier{" +
                "prenom='" + prenom + '\'' +
                "nom='" + getNom() + '\'' +
                ", adresse=" + getAdresse() +
                ", telephone='" + getTelephone() + '\'' +
                ", listeCompteBanquaires=" + getListeCompteBanquaires() +
                ", carteBanquaires=" + getCarteBanquaires() +
                ", placements=" + getPlacements() +
                '}';
    }

    @Override
    public String alternateToString(){
        return "\tClientParticulier{" +
                "prenom='" + prenom + '\'' +
                "nom='" + getNom() + '\'' +
                ", adresse=" + getAdresse() +
                '}';
    }

}
