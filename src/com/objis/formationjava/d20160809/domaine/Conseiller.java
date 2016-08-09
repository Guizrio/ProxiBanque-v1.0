package com.objis.formationjava.d20160809.domaine;

import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Conseiller extends Contact {

    private String prenom;
    private List<Client> clients;

    public String getPrenom(){
        return prenom;
    }

    public List<Client> getClients() {
        return clients;
    }

    public boolean addClient(Client client){
        return clients.add(client);
    }
}
