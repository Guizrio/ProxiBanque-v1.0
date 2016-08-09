package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class CarteBanquaire {

    private long numCarte;
    private boolean active;
    private LocalDateTime dateDebutValidite;
    private LocalDateTime dateFinValidite;

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
