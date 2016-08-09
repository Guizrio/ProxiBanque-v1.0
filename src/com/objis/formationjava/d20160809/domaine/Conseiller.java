package com.objis.formationjava.d20160809.domaine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Conseiller extends Contact {

    private String prenom;
    private List<Client> clients;

    public Conseiller(String nom, String prenom) {
        super(nom);
        this.prenom = prenom;
        initEmpty();
    }

    public Conseiller(String nom, String prenom, Adresse adresse, String telephone) {
        super(nom, adresse, telephone);
        this.prenom = prenom;
        initEmpty();
    }

    private void initEmpty(){
        clients = new ArrayList<>();
    }

    public String getPrenom(){
        return prenom;
    }

    public List<Client> getClients() {
        return clients;
    }

    public boolean addClient(Client client){

        if(client != null || !clients.contains(client)){
            return clients.add(client);
        }else{
            return false;
        }

    }

    public boolean removeClient(Client client){
        if(client != null){
            return clients.remove(client);
        }else{
            return false;
        }

    }
}
