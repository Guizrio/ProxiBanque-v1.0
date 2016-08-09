package com.objis.formationjava.d20160809.domaine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class Client extends Contact implements Idebiteur {

    private List<CompteBanquaire> listeCompteBanquaires;
    private List<CarteBanquaire> carteBanquaires;
    private List<Placement> placements;



    public Client(String nom) {
        super(nom);
        initEmpty();
    }


    public Client(String nom, Adresse adresse, String telephone) {
        super(nom, adresse, telephone);
        initEmpty();
    }


    private void initEmpty(){
        listeCompteBanquaires = new ArrayList<>();
        carteBanquaires = new ArrayList<>();
        placements = new ArrayList<>();
    }




    public List<CompteBanquaire> getListeCompteBanquaires() {
        return listeCompteBanquaires;
    }

    public List<CarteBanquaire> getCarteBanquaires() {
        return carteBanquaires;
    }

    public List<Placement> getPlacements() {
        return placements;
    }

    //Todo vérifier la validité de la méthode
    public boolean addCompteBanquaire(CompteBanquaire compteBanquaire){
        if(listeCompteBanquaires != null){

            int nbMemeClass = 0;

            for (int i = 0; i < listeCompteBanquaires.size(); i++) {
                if(listeCompteBanquaires.get(i).getClass() == compteBanquaire.getClass()){
                    nbMemeClass++;
                }
            }

            if(nbMemeClass  < 1){
                listeCompteBanquaires.add(compteBanquaire);
                return true;
            }


        }

        return false;
    }

}
