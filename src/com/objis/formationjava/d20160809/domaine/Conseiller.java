package com.objis.formationjava.d20160809.domaine;

import java.util.*;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Conseiller extends Contact {

    private String prenom;
    private Set<Client> clients;

    public String getPrenom(){
        return prenom;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public boolean addClient(Client client){
        return clients.add(client);
    }

    public boolean removeClient(Client client){
        return clients.remove(client);
    }
}
