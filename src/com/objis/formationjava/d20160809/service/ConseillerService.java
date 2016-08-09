package com.objis.formationjava.d20160809.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.objis.formationjava.d20160809.DAO.ConseillerDAO;
import com.objis.formationjava.d20160809.domaine.*;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ConseillerService {

	ConseillerDAO conseillerDAO1 = new ConseillerDAO();

	public ArrayList<Conseiller> getAllConseillers() {

		return conseillerDAO1.getAllConseillers();
	}

	// Todo refaire la methode
	public boolean addClient(Client client, Conseiller conseiller) {

		// Un client ne peut √™tre ajout√© que si celui-ci n'est pas null, que
		// le conseiller n'est pas null.
		if (client == null || conseiller == null) {

			return false;
		} else {

			// Test si le conseiller a d√©j√† un nombre maximum de client √† sa
			// charge
			if (conseiller.getClients().size() >= 10) {
				return false;
			} else {

				// Test si le client avait d√©j√† un conseiller, si c'et le cas,
				// on retire le client du pr√©c√©dent conseiller
				if (client.getConseiller() != null) {
					client.getConseiller().removeClient(client);
				}

				// On met √† jour la relation client <-> conseiller
				client.setConseiller(conseiller);
				conseiller.addClient(client);

				return true;

			}
		}
	}

	// Todo refaire la methode
	public boolean addClientParSaisi(Conseiller conseiller) {

		// Un client ne peut √™tre ajout√© que si celui-ci n'est pas null, que
		// le conseiller n'est pas null.
		if (conseiller == null) {

			return false;
		} else {

			// Test si le conseiller a d√©j√† un nombre maximum de client √† sa
			// charge
			if (conseiller.getClients().size() >= 10) {
				return false;
			} else {
				Scanner sc = new Scanner(System.in);
				System.out.println("RÈpondre aux demandes suivantes pour remplir le dossier client");
				System.out.println("Veuillez entrer le nom du client ‡ ajouter");
				String nom = sc.nextLine();
				System.out.println("Veuillez entrer le prenom du client ‡ ajouter");
				String prenom = sc.nextLine();
				System.out.println("Veuillez entrer la ville du client ‡ ajouter");
				String ville = sc.nextLine();
				System.out.println("Veuillez entrer le code postal du client ‡ ajouter");
				String codepostal = sc.nextLine();
				System.out.println("Veuillez entrer le numero et le nom de la rue du client ‡ ajouter");
				String adresse = sc.nextLine();
				System.out.println("Veuillez entrer le numero de tÈlÈphone du client ‡ ajouter");
				String pTelephone = sc.nextLine();
				sc.close();
				ClientParticulier clientsaisie = new ClientParticulier(nom, new Adresse(adresse, codepostal, ville), pTelephone,
						conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
						new ArrayList<Placement>(), prenom);

				// On met √† jour la relation client <-> conseiller
				clientsaisie.setConseiller(conseiller);
				conseiller.addClient(clientsaisie);

				return true;

			}
		}
	}

}
