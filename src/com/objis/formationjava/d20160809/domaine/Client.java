package com.objis.formationjava.d20160809.domaine;

import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class Client extends Contact implements Idebiteur {

    List<CompteBanquaire> listeCompteBanquaires;
    List<CarteBanquaire> CarteBanquaires;
    List<Placement> placements;





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
