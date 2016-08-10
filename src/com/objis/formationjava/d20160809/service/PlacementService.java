package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.*;
import com.objis.formationjava.d20160809.exceptions.CreatePlacementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Guillaume on 09/08/2016.
 */
public class PlacementService {

    public void createPlacement(ProxiBanque proxiBanque) throws CreatePlacementException {
        if(proxiBanque != null &&
                proxiBanque.getAgences() != null
                && !proxiBanque.getAgences().isEmpty()){


            List<Client> totalClients = new ArrayList<>();
            List<Client> eligibleClients = new ArrayList<>();

            for(Agence agence : proxiBanque.getAgences()){

                if(agence.getClients() != null){
                    totalClients.addAll(agence.getClients());

                    for(Client clientInAgence : agence.getClients()){

                        if(clientInAgence.getListeCompteBanquaires() != null
                                && !clientInAgence.getListeCompteBanquaires().isEmpty()){

                            //Here are potential eligible clients
                            double soldeCumule = 0.0;
                            boolean hasCourantCompte = false;
                            for(CompteBanquaire compteBanquaire : clientInAgence.getListeCompteBanquaires()){
                                soldeCumule += compteBanquaire.getSolde();
                                if(compteBanquaire instanceof CompteCourant){
                                    hasCourantCompte = true;
                                }
                            }

                            if(soldeCumule >= 500000 && hasCourantCompte){
                                eligibleClients.add(clientInAgence);
                            }

                        }


                    }

                }

            }


            if(eligibleClients.isEmpty()){
                throw new CreatePlacementException("Il n'y a pas de clients de proxiBanque dont le solde cumule des comptes soit supérieur à 500000.");
            }

            Scanner sc = new Scanner(System.in);



            System.out.println("\n\nVous allez maintenant faire un placement.\n\n Entrez le numero d'ordre d'apparition " +
                    "du client parmis la liste suivante, puis valider en appuyant sur Entrée\n (Les clients qui apparaissent sont ceux éligibles) :");
            for (Client client : eligibleClients){
                System.out.println(client.alternateToString());
            }
            int numeroClient = Integer.valueOf(sc.nextLine());

            System.out.println("\nEntrez la nature du placement (Boursier ou Logement) et appuyez sur Entree:");
            String nature =  sc.nextLine();


            System.out.println("\nEntrez le montant du placement voulu et appuyez sur Entree : ");
            double montant = Double.valueOf(sc.nextLine());

            Placement placement;

            if(nature.equalsIgnoreCase("Logement")){
                placement = new PlacementImmobillier("VilleDefaut", montant);
            }else if(nature.equalsIgnoreCase("Boursier")){
                placement = new PlacementBoursier("VilleDefaut", montant);
            }else{
                throw new CreatePlacementException("La nature du placement n'existe pas dans proxiBanque");
            }

            Client notreClientFortune = eligibleClients.get(numeroClient -1);

            notreClientFortune.addPlacement(placement);

            for(CompteBanquaire compteBanquaire : notreClientFortune.getListeCompteBanquaires()){
                if(compteBanquaire instanceof CompteCourant){
                    compteBanquaire.retirerMontant(montant);
                }
            }


        }

    }

}
