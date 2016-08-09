package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Gerant extends Conseiller {

    public Gerant(String nom, String prenom) {
        super(nom, prenom);
    }

    public Gerant(String nom, String prenom, Adresse adresse, String telephone) {
        super(nom, prenom, adresse, telephone);
    }

}
