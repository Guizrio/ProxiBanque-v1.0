package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Classe abstraite permettant définir des objets Carte Banquaires. Les cartes banquaires sont définies par: leur numéros de carte (long),
 * <p>
 * leur etat d'activation (booléen), leur date de début de et de fin de validité(LocalDateTime)
 * 
 * @author Guillaume et Vincent
 */
public abstract class CarteBanquaire {

    private long numCarte;
    private boolean active;
    private LocalDateTime dateDebutValidite;
    private LocalDateTime dateFinValidite;

    /**
     * Constructeur de carte banquaire à partir de son numéro de carte, son etat d'activation, et ses dates de début et de fin d'activation 
     * @param numCarte numéro de carte de la carte banquaire
     * @param active etat d'activation de la carte;
     * @param dateDebutValidite date de début de validité de la carte
     * @param dateFinValidite date de fin de validité de la carte
     */
    public CarteBanquaire(long numCarte, boolean active, LocalDateTime dateDebutValidite, LocalDateTime dateFinValidite) {
        this.numCarte = numCarte;
        this.active = active;
        this.dateDebutValidite = dateDebutValidite;
        this.dateFinValidite = dateFinValidite;
    }

    public long getNumCarte() {
        return numCarte;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getDateDebutValidite() {
        return dateDebutValidite;
    }

    public LocalDateTime getDateFinValidite() {
        return dateFinValidite;
    }
}
