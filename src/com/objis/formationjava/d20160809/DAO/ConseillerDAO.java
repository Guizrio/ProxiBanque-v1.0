package com.objis.formationjava.d20160809.DAO;

import java.util.ArrayList;

import com.objis.formationjava.d20160809.domaine.Adresse;
import com.objis.formationjava.d20160809.domaine.Conseiller;

public class ConseillerDAO {

	public ArrayList<Conseiller> getAllConseillers() {
		ArrayList<Conseiller> listConseillersdelaBasedeDonn�es = new ArrayList<Conseiller>();
		listConseillersdelaBasedeDonn�es.add(new Conseiller("Dupont",
				new Adresse("rue des mouettes", "90003", "Lyon"), "+33 6 78 96 20", "Guy-Georges"));
		listConseillersdelaBasedeDonn�es.add(new Conseiller("Durant",
				new Adresse("rue des cochons", "90002", "Lyon"), "+33 6 87 60 14", "Jean-Marie"));
		listConseillersdelaBasedeDonn�es.add(new Conseiller("Tardy",
				new Adresse("rue des chats", "90009", "Lyon"), "+33 7 98 26 41", "Brice"));

		return listConseillersdelaBasedeDonn�es;

	}
}
