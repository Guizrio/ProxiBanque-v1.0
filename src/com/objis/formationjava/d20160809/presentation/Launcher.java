package com.objis.formationjava.d20160809.presentation;

import com.objis.formationjava.d20160809.domaine.*;
import com.objis.formationjava.d20160809.exceptions.CreatePlacementException;
import com.objis.formationjava.d20160809.exceptions.CreateVirementException;
import com.objis.formationjava.d20160809.exceptions.ImpossibleLinkException;
import com.objis.formationjava.d20160809.service.*;

import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Launcher {

    public static void main(String[] args){

        ProxiBanque proxiBanque = new ProxiBanque();
        AgenceService agenceService = new AgenceService();
        ConseillerService conseillerService = new ConseillerService();
        ClientService clientService = new ClientService();
        CompteBanquaireService compteBanquaireService = new CompteBanquaireService();
        VirementService virementService = new VirementService();
        PlacementService placementService = new PlacementService();


        Agence agence = agenceService.createAgence();
        proxiBanque.addAgence(agence);
        List<Conseiller> conseillers = conseillerService.getAllConseiller();
        List<Client> clients = clientService.getAllClient();

        conseillerService.addClient(agence, conseillers.get(0), clients.get(0));
        conseillerService.addClient(agence, conseillers.get(1), clients.get(1));
        conseillerService.addClient(agence, conseillers.get(1), clients.get(2));
        conseillerService.addClient(agence, conseillers.get(1), clients.get(3));

        List<CompteBanquaire> compteBanquaires = compteBanquaireService.getAllComptes();

        try {
            compteBanquaireService.linkCompteBanquaire(agence, compteBanquaires.get(0), clients.get(0));
            compteBanquaireService.linkCompteBanquaire(agence, compteBanquaires.get(1), clients.get(1));
            compteBanquaireService.linkCompteBanquaire(agence, compteBanquaires.get(2), clients.get(2));
            compteBanquaireService.linkCompteBanquaire(agence, compteBanquaires.get(3), clients.get(3));
            compteBanquaireService.linkCompteBanquaire(agence, compteBanquaires.get(4), clients.get(0));
            compteBanquaireService.linkCompteBanquaire(agence, compteBanquaires.get(5), clients.get(1));

        } catch (ImpossibleLinkException e) {
            e.printStackTrace();
        }

        try {
            virementService.createVirement(proxiBanque);
            System.out.println("\nVirement effectué !\n");
        } catch (CreateVirementException e) {
            e.printStackTrace();
        }


        System.out.println("Voici les résultats des comptes des clients :");
        System.out.println(clients);
        System.out.println("\n\n");


        try {
            placementService.createPlacement(proxiBanque);
            System.out.println("placement réalisé !");
        } catch (CreatePlacementException e) {
            e.printStackTrace();
        }

        System.out.println("Voici les résultats des clients :");
        System.out.println(clients);
        System.out.println("\n\n");

        System.out.println();


    }

}
