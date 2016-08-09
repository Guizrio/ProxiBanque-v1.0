package com.objis.formationjava.d20160809.DAO;

import java.util.*;

import com.objis.formationjava.d20160809.domaine.*;

public class ClientDAO {

	public Set<Client> getAllClientAgence() {
		Set<Client> clients = new HashSet<Client>();
		Conseiller dupont = new Conseiller("Dupont", new Adresse("rue des mouettes", "90003", "Lyon"), "+33 6 78 96 20",
				"Guy-Georges");
		Conseiller durant = new Conseiller("Durant", new Adresse("rue des cochons", "90002", "Lyon"), "+33 6 87 60 14",
				"Jean-Marie");
		Conseiller brice = new Conseiller("Tardy", new Adresse("rue des chats", "90009", "Lyon"), "+33 7 98 26 41",
				"Brice");
		clients.add(new ClientParticulier("Theodoroux", new Adresse("rue des chiens", "90012", "Lyon"),
				"+33 7 89 66 44", brice, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
				new ArrayList<Placement>(), "Thomas"));
		clients.add(new ClientParticulier("Theodoroux", new Adresse("rue des chiens", "90012", "Lyon"),
				"+33 7 89 66 44", brice, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
				new ArrayList<Placement>(), "Marie"));
		clients.add(new ClientParticulier("Theodoroux", new Adresse("rue des chiens", "90012", "Lyon"),
				"+33 7 89 66 44", brice, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
				new ArrayList<Placement>(), "junior"));
		clients.add(new ClientParticulier("RIO", new Adresse("rue des renards", "90013", "Lyon"), "+33 7 89 86 47",
				dupont, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(), new ArrayList<Placement>(),
				"Guillaume"));
		clients.add(new ClientParticulier("RIO", new Adresse("rue des renards", "90013", "Lyon"), "+33 7 89 76 44",
				dupont, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(), new ArrayList<Placement>(),
				"Père"));
		clients.add(new ClientParticulier("RIO", new Adresse("rue des renards", "90013", "Lyon"), "+33 7 89 76 44",
				dupont, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(), new ArrayList<Placement>(),
				"Mère"));
		clients.add(new ClientParticulier("Blameble", new Adresse("rue Birot", "97213", "Gros-Morne"),
				"+33 6 43 10 47 18", durant, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
				new ArrayList<Placement>(), "Vincent"));
		clients.add(new ClientParticulier("Blameble", new Adresse("rue Birot", "97213", "Gros-Morne"),
				"+33 6 43 10 47 18", durant, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
				new ArrayList<Placement>(), "Paul"));
		clients.add(new ClientParticulier("Blameble", new Adresse("rue Birot", "97213", "Gros-Morne"),
				"+33 6 43 10 47 18", durant, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
				new ArrayList<Placement>(), "Françoise"));
		return clients;
	}

	public Set<Client> getAllClientDuConseiller(Conseiller conseiller) {
		Conseiller dupont = new Conseiller("Dupont", new Adresse("rue des mouettes", "90003", "Lyon"), "+33 6 78 96 20",
				"Guy-Georges");
		Conseiller durant = new Conseiller("Durant", new Adresse("rue des cochons", "90002", "Lyon"), "+33 6 87 60 14",
				"Jean-Marie");
		Conseiller brice = new Conseiller("Tardy", new Adresse("rue des chats", "90009", "Lyon"), "+33 7 98 26 41",
				"Brice");

		Set<Client> clients = new HashSet<Client>();
		if (conseiller.equals(brice)) {
			clients.add(new ClientParticulier("Theodoroux", new Adresse("rue des chiens", "90012", "Lyon"),
					"+33 7 89 66 44", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Thomas"));
			clients.add(new ClientParticulier("Theodoroux", new Adresse("rue des chiens", "90012", "Lyon"),
					"+33 7 89 66 44", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Marie"));
			clients.add(new ClientParticulier("Theodoroux", new Adresse("rue des chiens", "90012", "Lyon"),
					"+33 7 89 66 44", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "junior"));
			clients.add(new ClientEntreprise("SOPRA", new Adresse("rue des Dev", "90009", "Limonest"),
					"+33 6 79 89 91 77", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>()));
		} else if (conseiller.equals(dupont)) {
			clients.add(new ClientParticulier("RIO", new Adresse("rue des renards", "90013", "Lyon"), "+33 7 89 86 47",
					conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Guillaume"));
			clients.add(new ClientParticulier("RIO", new Adresse("rue des renards", "90013", "Lyon"), "+33 7 89 76 44",
					conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Père"));
			clients.add(new ClientParticulier("RIO", new Adresse("rue des renards", "90013", "Lyon"), "+33 7 89 76 44",
					conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Mère"));
		} else if (conseiller.equals(durant)) {
			clients.add(new ClientParticulier("Blameble", new Adresse("rue Birot", "97213", "Gros-Morne"),
					"+33 6 43 10 47 18", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Vincent"));
			clients.add(new ClientParticulier("Blameble", new Adresse("rue Birot", "97213", "Gros-Morne"),
					"+33 6 43 10 47 18", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Paul"));
			clients.add(new ClientParticulier("Blameble", new Adresse("rue Birot", "97213", "Gros-Morne"),
					"+33 6 43 10 47 18", conseiller, new ArrayList<CompteBanquaire>(), new ArrayList<CarteBanquaire>(),
					new ArrayList<Placement>(), "Françoise"));
		}
		return clients;
	}

}
