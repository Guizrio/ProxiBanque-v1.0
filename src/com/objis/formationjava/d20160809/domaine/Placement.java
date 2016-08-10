package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class Placement {

    private String ville;
    private double montant;

    public Placement(String ville, double montant) {
        this.ville = ville;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Placement{" +
                "ville='" + ville + '\'' +
                ", montant=" + montant +
                '}';
    }
}
