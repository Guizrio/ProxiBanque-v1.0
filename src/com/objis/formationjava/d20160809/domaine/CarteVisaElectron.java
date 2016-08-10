package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Classe permettant de créer des objets Carte visa Electron . Les cartes banquaires sont définies par: leur numéros de carte (long),
 * <p>
 * leur etat d'activation (booléen), leur date de début de et de fin de validité(LocalDateTime)
 * 
 * @author Guillaume et Vincent
 */
public class CarteVisaElectron extends CarteBanquaire{

    public CarteVisaElectron(long numCarte, boolean active, LocalDateTime dateDebutValidite, LocalDateTime dateFinValidite) {
        super(numCarte, active, dateDebutValidite, dateFinValidite);
    }
}
