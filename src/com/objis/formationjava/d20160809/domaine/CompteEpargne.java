package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class CompteEpargne extends CompteBanquaire {

    private double tauxRemuneration;


    public CompteEpargne(long numCompte, LocalDateTime dateOuverture) {
        super(numCompte, dateOuverture);
        init();
    }

    public CompteEpargne(long numCompte, double solde, LocalDateTime dateOuverture) {
        super(numCompte, solde, dateOuverture);
        init();
    }

    private void init(){
        tauxRemuneration = 0.03;
    }


    public double getTauxRemuneration() {
        return tauxRemuneration;
    }
}
