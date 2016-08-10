package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Adresse;
import com.objis.formationjava.d20160809.domaine.Agence;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.Conseiller;
import com.objis.formationjava.d20160809.utils.MyRandomizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ConseillerService {

    public Conseiller createConseiller(){
        return new Conseiller("nom_" + MyRandomizer.generate(7), "prenom_" + MyRandomizer.generate(7),
                new Adresse("adresse_" + MyRandomizer.generate(5),
                        MyRandomizer.generateCodePostal(),
                        "ville_" + MyRandomizer.generate(5)), MyRandomizer.generatePhone());
    }


    public List<Conseiller> getAllConseiller(){
        List<Conseiller> conseillers = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            conseillers.add(createConseiller());
        }

        return conseillers;
    }


    public void addClient(Agence agence, Conseiller conseiller, Client client){

        if(conseiller != null && conseiller.getClients() != null && client != null){
            if(conseiller.getClients().size() > 10){
                System.err.println("Le nombre maximal de client est déjà attribué pour le conseiller " + conseiller);
            }else{

                if(agence.getConseillers() == null){
                    agence.addConseiller(conseiller);
                    System.out.println("Le conseiller a été ajouté à l'agence");
                }

                for(Conseiller conseillerInAgence : agence.getConseillers()){
                    conseiller.removeClient(client);
                }

                agence.addClient(client);
                System.out.println("le client a été ajouté à la liste d'agence !");
                conseiller.addClient(client);
                System.out.println("le client a été ajouté à la liste des client du conseiller");


            }
        }else{
            System.err.println("Tentative d'ajouter un triplet Client, Conseiller, Agence avec l'un des trois non initialisé");
        }


    }

}
