package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de créer des objets Agence.
 * <p>
 * Une agence a pour attribut un identifiant (chaine de caractere), sa date de
 * creation,(localDateTime),
 * <p>
 * un gérant, une liste de Conseillers et une liste de clients.
 * 
 * @author Guillaume et Vincent
 */
public class Agence {

	private String id;
	private LocalDateTime dateCreation;
	private Adresse adresse;

	private Gerant gerant;
	private List<Conseiller> conseillers;
	private List<Client> clients;

	/**
	 * Constructeur d'agence a partir d'un identifiant (chaine de caractere), de sa date de creation,(localDateTime),
	 * <p>
	 * de son adresse et d'un gérant. Ses listes de conseillers et de Clients sont initialisé comme des Arraylist vides.
	 * @param id identifiant de l'agence
	 * @param dateCreation date de creation de l'agence          
	 * @param adresse  adresse de l'agence
	 * @param gerant gérant de l'agence      
	 */
	public Agence(String id, LocalDateTime dateCreation, Adresse adresse, Gerant gerant) {
		this.id = id;
		this.dateCreation = dateCreation;
		this.adresse = adresse;
		this.gerant = gerant;
		conseillers = new ArrayList<>();
		clients = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public List<Client> getClients() {
		return clients;
	}

	
	/**
	 * Methode permettant d'ajouter un objet conseiller à la liste de conseillers de l'agence.
	 * <p>
	 * Retourne un booléen a true si l'opération a été effectuée avec succés et a false si abandon.
	 * @param conseiller conseiller à ajouter;
	 * @return
	 */
	public boolean addConseiller(Conseiller conseiller) {
		if (conseiller != null && !conseillers.contains(conseiller)) {
			conseillers.add(conseiller);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Methode permettant d'enlever un objet conseiller à la liste de conseillers de l'agence.
	 * <p>
	 * Retourne un booléen a true si l'opération a été effectuée avec succés et a false si abandon.
	 * @param conseiller conseiller à ajouter;
	 * @return
	 */
	public boolean removeConseiller(Conseiller conseiller) {

		// Todo not implemented : procédure lourde (gérer la répartition des
		// clients sur d'autres conseillers -si c'est possible-)
		if (conseiller != null) {
			return conseillers.remove(conseiller);
		} else {
			return false;
		}

	}

	/**
	 * Methode permettant d'ajouter un objet client à la liste des clients de l'agence.
	 * <p>
	 * Retourne un booléen a true si l'opération a été effectuée avec succés et a false si abandon.
	 * @param conseiller conseiller à ajouter;
	 * @return
	 */
	public boolean addClient(Client client) {
		if (client != null && !clients.contains(client)) {
			return clients.add(client);
		} else {
			return false;
		}
	}

	/**
	 * Methode permettant d'enlever un objet client à la liste des clients de l'agence.
	 * <p>
	 * Retourne un booléen a true si l'opération a été effectuée avec succés et a false si abandon.
	 * @param conseiller conseiller à ajouter;
	 * @return
	 */
	public boolean removeClient(Client client) {
		if (client != null) {
			for (Conseiller conseiller : conseillers) {
				if (conseiller.getClients().contains(client)) {
					conseiller.removeClient(client);
				}
			}
			return clients.remove(client);
		} else {
			return false;
		}
	}

	public boolean setGerant(Gerant gerant) {

		if (gerant != null) {
			this.gerant = gerant;
			return true;
		}

		return false;
	}
}
