package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Agence {

    private String id;
    private LocalDateTime dateCreation;
    private Adresse adresse;

    private Gerant gerant;
    private List<Conseiller> conseillers;
    private List<Client> clients;

    public Agence(String id, LocalDateTime dateCreation, Adresse adresse, Gerant gerant) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.adresse = adresse;
        this.gerant = gerant;
        conseillers = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Gerant getGerant() {
        return gerant;
    }

    public List<Conseiller> getConseillers() {
        return conseillers;
    }

    public List<Client> getClients() {
        return clients;
    }

    public boolean addConseiller(Conseiller conseiller){
        if(conseiller != null && !conseillers.contains(conseiller)){
            conseillers.add(conseiller);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeConseiller(Conseiller conseiller){

        //Todo not implemented : procédure lourde (gérer la répartition des clients sur d'autres conseillers -si c'est possible-)
        if(conseiller != null){
            return conseillers.remove(conseiller);
        }else{
            return false;
        }

    }


    public boolean addClient(Client client){
        if(client != null && !clients.contains(client)){
            return clients.add(client);
        }else{
            return false;
        }
    }

    public boolean removeClient(Client client){
        if(client != null){
            for(Conseiller conseiller : conseillers){
                if(conseiller.getClients().contains(client)){
                    conseiller.removeClient(client);
                }
            }
            return clients.remove(client);
        }else{
            return false;
        }
    }

    public boolean setGerant(Gerant gerant) {

        if(gerant != null){
            this.gerant = gerant;
            return true;
        }

        return false;
    }
}
