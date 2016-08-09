package com.objis.formationjava.d20160809.domaine;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ClientParticulier extends Client implements Idebiteur{

    private String prenom;

    @Override
    public double getMaxDebit() {
        return 0;
    }
}
