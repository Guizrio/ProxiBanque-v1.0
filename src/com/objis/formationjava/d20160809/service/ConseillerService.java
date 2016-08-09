package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.Conseiller;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ConseillerService {


    //Todo refaire la methode
    public boolean addClient(Client client, Conseiller conseiller){

        //Un client ne peut être ajouté que si celui-ci n'est pas null, que le conseiller n'est pas null, et que

        client.setConseiller(conseiller);
        conseiller.addClient(client);

        return true;
    }

}
