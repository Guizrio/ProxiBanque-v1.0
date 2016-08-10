package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Classe permettant de créer des objets Carte visa Premier . Les cartes banquaires sont définies par: leur numéros de carte (long),
 * <p>
 * leur etat d'activation (booléen), leur date de début de et de fin de validité(LocalDateTime)
 * 
 * @author Guillaume et Vincent
 */
public class CarteVisaPremier extends CarteBanquaire {
	
	/**
	 * Constructeur de carte visa Premier à partir de son numéro de carte, son etat d'activation, et ses dates de début et de fin d'activation 
     * @param numCarte numéro de carte de la carte banquaire
     * @param active etat d'activation de la carte;
     * @param dateDebutValidite date de début de validité de la carte
     * @param dateFinValidite date de fin de validité de la carte
     */
    public CarteVisaPremier(long numCarte, boolean active, LocalDateTime dateDebutValidite, LocalDateTime dateFinValidite) {
        super(numCarte, active, dateDebutValidite, dateFinValidite);
    }
}
