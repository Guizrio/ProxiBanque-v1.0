package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.*;
import com.objis.formationjava.d20160809.exceptions.ImpossibleLinkException;
import com.objis.formationjava.d20160809.utils.MyRandomizer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume on 09/08/2016.
 */
public class CompteBanquaireService {

    public CompteBanquaire createCompteEpargne(){
        return new CompteEpargne(Long.valueOf(MyRandomizer.generateInt(5)), LocalDateTime.now());
    }

    public CompteBanquaire createCompteCourant(){
        return new CompteCourant(Long.valueOf(MyRandomizer.generateInt(5)), LocalDateTime.now());
    }


    public List<CompteBanquaire> getAllComptes(){

        List<CompteBanquaire> compteBanquaires = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            compteBanquaires.add(createCompteCourant());
        }

        for (int i = 0; i < 2; i++) {
            compteBanquaires.add(createCompteEpargne());
        }


        return compteBanquaires;

    }


    public void linkCompteBanquaire(Agence agence, CompteBanquaire compteBanquaire, Client client) throws ImpossibleLinkException{

        if(agence != null && compteBanquaire != null && client != null){

            if(agence.getClients() != null){

                for(Client clientInAgence : agence.getClients()){
                    if(clientInAgence.getListeCompteBanquaires() != null){

                        for(CompteBanquaire compteBanquaireInClientInAgence : clientInAgence.getListeCompteBanquaires()){

                            if(compteBanquaire.equals(compteBanquaireInClientInAgence)
                                    && !client.equals(clientInAgence)){

                                throw new ImpossibleLinkException("Le compte banquaire est déjà relié à un autre client");

                            }

                        }

                    }
                }

            }

            try {
                client.addCompteBanquaire(compteBanquaire);
                System.out.println("Le compte banquaire a bien été ajouté au client !");
            } catch (ImpossibleLinkException e) {
                e.printStackTrace();
            }


        }


    }


}
