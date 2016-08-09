package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class CompteCourant extends CompteBanquaire {

    private double decouvertAutorise;

    public CompteCourant(long numCompte, LocalDateTime dateOuverture) {
        super(numCompte, dateOuverture);
        init();
    }

    public CompteCourant(long numCompte, double solde, LocalDateTime dateOuverture) {
        super(numCompte, solde, dateOuverture);
        init();
    }

    private void init(){
        decouvertAutorise = 1000;
    }


    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }
}
