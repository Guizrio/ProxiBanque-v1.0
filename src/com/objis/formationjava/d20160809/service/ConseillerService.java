package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.Conseiller;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ConseillerService {


    //Todo refaire la methode
    public boolean addClient(Client client, Conseiller conseiller){

        //Un client ne peut être ajouté que si celui-ci n'est pas null, que le conseiller n'est pas null.
        if(client ==null || conseiller == null){

            return false;
        }else{

            //Test si le conseiller a déjà un nombre maximum de client à sa charge
            if(conseiller.getClients().size() >= 10){
                return false;
            }else{

                //Test si le client avait déjà un conseiller, si c'et le cas, on retire le client du précédent conseiller
                if(client.getConseiller() != null){
                    client.getConseiller().removeClient(client);
                }

                //On met à jour la relation client <-> conseiller
                client.setConseiller(conseiller);
                conseiller.addClient(client);

                return true;

            }
        }
    }

}
