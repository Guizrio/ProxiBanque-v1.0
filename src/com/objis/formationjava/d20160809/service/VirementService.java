package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.*;
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
                for (Client client : clients){
                    System.out.println(client.alternateToString());
                }
                int numeroClientDebiteur = Integer.valueOf(sc.nextLine());
                System.out.println("\nEntrez le numero d'ordre d'apparition du compte débiteur voulu :");
                List<CompteBanquaire> comptesDuDebiteur = clients.get(numeroClientDebiteur - 1).getListeCompteBanquaires();
                for (CompteBanquaire compteBanquaire : comptesDuDebiteur){
                    System.out.println(compteBanquaire.alternateToString());
                }
                int numeroCompteDebiteur = Integer.valueOf(sc.nextLine());

                CompteBanquaire compteDebiteur = comptesDuDebiteur.get(numeroCompteDebiteur -1);


                //On rentre le compte créditeur
                System.out.println("\n\nEntrez le numero d'ordre d'apparition du client créditeur parmis la liste suivante, puis valider en appuyant sur Entrée :");
                for (Client client : clients){
                    System.out.println(client.alternateToString());
                }
                int numeroClientCrediteur = Integer.valueOf(sc.nextLine());

                System.out.println("\nEntrez le numero d'ordre d'apparition du compte créditeur voulu :");
                List<CompteBanquaire> comptesDuCrediteur = clients.get(numeroClientCrediteur - 1).getListeCompteBanquaires();
                for (CompteBanquaire compteBanquaire : comptesDuCrediteur){
                    System.out.println(compteBanquaire.alternateToString());
                }
                int numeroCompteCrediteur = Integer.valueOf(sc.nextLine());

                CompteBanquaire compteCrediteur = comptesDuCrediteur.get(numeroCompteCrediteur -1);


                System.out.println("\nEntrez le montant du virement :");
                double montant = Double.valueOf(sc.nextLine());

                sc.close();

                Virement virement = new Virement(compteDebiteur.getNumCompte(), compteCrediteur.getNumCompte(), montant);

                compteDebiteur.ajouterVirement(virement);
                compteDebiteur.retirerMontant(montant);

                compteCrediteur.ajouterVirement(virement);
                compteCrediteur.ajouterMontant(montant);

            }



        }else{
            throw new CreateVirementException("Impossible de créer un virement dans la configuration d'agence actuelle");
        }


    }

}
