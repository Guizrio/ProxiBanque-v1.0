package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class CarteBanquaire {

	private long numCarte;
	private boolean active;
	private LocalDateTime dateDebutValidite;
	private LocalDateTime dateFinValidite;
	private Client client;

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the numCarte
	 */
	public long getNumCarte() {
		return numCarte;
	}

	/**
	 * @return the dateDebutValidite
	 */
	public LocalDateTime getDateDebutValidite() {
		return dateDebutValidite;
	}

	/**
	 * @return the dateFinValidite
	 */
	public LocalDateTime getDateFinValidite() {
		return dateFinValidite;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

}
