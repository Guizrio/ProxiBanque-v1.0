package com.objis.formationjava.d20160809.domaine;

/**
 * Classe abstraite permettant de définir les objets Contact. 
 * <p>
 * Un contact est caractérisé par son nom, son adresse et son numéro de télephone.
 * 
 * @author Guillaume et Vincent
 */
public abstract class Contact {

    protected String nom;
    private Adresse adresse;
    private String telephone;


    /**
     * Constructeur de contact à partir de son nom.
     * <p>
     * son adresse et son telephone sont initialisés null
     * @param nom nom du contact
     */
    public Contact(String nom) {
        this.nom = nom;
    }

    /**
     *  Constructeur de contact à partir de son nom, de son adresse (type adresse) et de son numéro de telephone.
     *  
     * @param nom nom du contact
     * @param adresse adresse du contact (adresse, CodePostal,Ville)
     * @param telephone numéro de télephone
     */
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
