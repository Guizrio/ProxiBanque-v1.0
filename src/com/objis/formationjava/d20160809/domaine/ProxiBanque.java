package com.objis.formationjava.d20160809.domaine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ProxiBanque {

    List<Agence> agences;

    public ProxiBanque() {
        agences = new ArrayList<>();
    }


    public List<Agence> getAgences() {
        return agences;
    }

    public boolean addAgence(Agence agence){
        if(agence != null && !agences.contains(agence)){
            return agences.add(agence);
        }else{
            return false;
        }
    }
}
