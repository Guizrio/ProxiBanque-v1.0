package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Agence;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.CompteBanquaire;
import com.objis.formationjava.d20160809.domaine.ProxiBanque;
import com.objis.formationjava.d20160809.exceptions.CreateVirementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Guillaume on 09/08/2016.
 */
public class VirementService {



    public void createVirement(ProxiBanque proxiBanque) throws CreateVirementException {

        if(proxiBanque != null && proxiBanque.getAgences() != null
                && !proxiBanque.getAgences().isEmpty() && proxiBanque.getAgences().get(0).getClients() != null
                && !proxiBanque.getAgences().get(0).getClients().isEmpty()){

            List<CompteBanquaire> compteBanquaires = new ArrayList<>();
            List<Client> clients = new ArrayList<>();

            for(Agence agence : proxiBanque.getAgences()){
                for(Client client : agence.getClients()){
                    compteBanquaires.addAll(client.getListeCompteBanquaires());

                    if(!client.getListeCompteBanquaires().isEmpty()){
                        clients.add(client);
                    }

                }
            }

            if(compteBanquaires.size() < 2){
                throw new CreateVirementException("Il n'y a pas assez de compte dans ProxiBanque pour effectuer un virement");
            }else{
                Scanner sc = new Scanner(System.in);

                //On rentre le compte débiteur
                System.out.println("\n\nVous allez maintenant faire un virement.\n\n Entrez le numero d'ordre d'apparition du client débiteur parmis la liste suivante, puis valider en appuyant sur Entrée :");
                System.out.println(clients);
                String numeroClientDebiteur = sc.nextLine();
                System.out.println("\nEntrez l'id du compte débiteur voulu :");
                System.out.println();
                String numeroCompteDebiteur = sc.nextLine();


                //On rentre le compte créditeur
                System.out.println("\n\nEntrez le numero d'ordre d'apparition du client créditeur parmis la liste suivante, puis valider en appuyant sur Entrée :");
                System.out.println(clients);
                String numeroClientCrediteur = sc.nextLine();
                System.out.println("\nEntrez l'id du compte débiteur voulu :");
                String numeroCompteCrediteur = sc.nextLine();

                //On rappel l'ordre
//                Virement virement = new Virement();
                sc.close();

            }



        }else{
            throw new CreateVirementException("Impossible de créer un virement dans la configuration d'agence actuelle");
        }


    }

}
