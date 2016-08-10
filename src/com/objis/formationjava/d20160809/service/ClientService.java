package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Adresse;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.ClientEntreprise;
import com.objis.formationjava.d20160809.domaine.ClientParticulier;
import com.objis.formationjava.d20160809.utils.MyRandomizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ClientService {

    public Client createClientParticulier(){
        return new ClientParticulier("nom_" + MyRandomizer.generate(7), "prenom_" + MyRandomizer.generate(7),
                new Adresse("adresse_" + MyRandomizer.generate(5),
                        MyRandomizer.generateCodePostal(),
                        "ville_" + MyRandomizer.generate(5)), MyRandomizer.generatePhone());
    }

    public Client createClientEntreprise(){
        return new ClientEntreprise("nom_" + MyRandomizer.generate(7),
                new Adresse("adresse_" + MyRandomizer.generate(5),
                        MyRandomizer.generateCodePostal(),
                        "ville_" + MyRandomizer.generate(5)), MyRandomizer.generatePhone());
    }


    public List<Client> getAllClient(){
        List<Client> clients = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            clients.add(createClientParticulier());
        }


        for (int i = 0; i < 1; i++) {
            clients.add(createClientEntreprise());
        }

        return clients;
    }


}
