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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conseiller)) return false;

        Conseiller that = (Conseiller) o;

        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        return clients != null ? clients.equals(that.clients) : that.clients == null;

    }

    @Override
    public int hashCode() {
        int result = prenom != null ? prenom.hashCode() : 0;
        result = 31 * result + (clients != null ? clients.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Conseiller{" +
                ", nom='" + getNom()+ '\'' +
                ", adresse=" + getAdresse()+
                ", telephone='" + getTelephone()+ '\'' +
                "prenom='" + prenom + '\'' +
                ", clients=" + clients +
                '}';
    }
}
