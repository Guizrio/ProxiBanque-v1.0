package com.objis.formationjava.d20160809.domaine;


import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class CompteBanquaire {

    private long numCompte;
    private double solde;
    private LocalDateTime dateOuverture;
    private List<Virement> virements;

}
