package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class PlacementImmobillier extends Placement {

    public PlacementImmobillier(String ville, double montant) {

        super(ville, montant);
        type = "Logement";
    }
}
