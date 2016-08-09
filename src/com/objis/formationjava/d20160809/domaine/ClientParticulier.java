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
}
