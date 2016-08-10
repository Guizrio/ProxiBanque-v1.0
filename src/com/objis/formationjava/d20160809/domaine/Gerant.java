package com.objis.formationjava.d20160809.domaine;

/**
 * Classe permettant de créer des objets gérants. Hérite de la classe Conseiller.
 * <p>
 * Un gérants est caractérisé par son nom, son adresse et son numéro de télephone ainsi que par son prénom et une liste de Clients.
 * 
 * @author Guillaume et Vincent
 */
public class Gerant extends Conseiller {

	 /**
     * Constructeur de gérant à partir de son nom et son prénom.
     * <p>
     * On considère que le gérant commence avec aucun client associé et donc une liste clients vide. Son adresse et
     * <p>
     * numéro de teléphone ne sont pas initialisé (null).
     * @param nom nom du gérant
     * @param prenom prénom du gérant
     */
    public Gerant(String nom, String prenom) {
        super(nom, prenom);
    }

    /**
     * Constructeur de gérant à partir de son nom, son prénom, son adresse et son numéro de téléphone
     * <p>
     * On considère que le gérant commence avec aucun client associé et donc une liste clients vide.
     * @param nom nom du gérant
     * @param prenom prénom du gérant
     * @param adresse adresse du gérant
     * @param telephone numéro du gérant
     */
    public Gerant(String nom, String prenom, Adresse adresse, String telephone) {
        super(nom, prenom, adresse, telephone);
    }

}
