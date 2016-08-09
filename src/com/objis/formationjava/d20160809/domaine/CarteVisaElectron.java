package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class CarteVisaElectron extends CarteBanquaire{

    public CarteVisaElectron(long numCarte, boolean active, LocalDateTime dateDebutValidite, LocalDateTime dateFinValidite) {
        super(numCarte, active, dateDebutValidite, dateFinValidite);
    }
}
