package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class Contact {

    protected String nom;
    private Adresse adresse;
    private String telephone;


    public Contact(String nom) {
        this.nom = nom;
    }

    public Contact(String nom, Adresse adresse, String telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }


    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", adresse=" + adresse +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
