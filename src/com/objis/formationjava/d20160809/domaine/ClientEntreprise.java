package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ClientEntreprise extends Client{


    public ClientEntreprise(String nom) {
        super(nom);
    }

    public ClientEntreprise(String nom, Adresse adresse, String telephone) {
        super(nom, adresse, telephone);
    }

    @Override
    public double getMaxDebit() {
        return 0;
    }
}
