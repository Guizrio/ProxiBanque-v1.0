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

    public Agence(String id, LocalDateTime dateCreation, Adresse adresse, Gerant gerant) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.adresse = adresse;
        this.gerant = gerant;
        conseillers = new ArrayList<>();
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

    public boolean addConseiller(Conseiller conseiller){
        if(conseiller != null && !conseillers.contains(conseiller)){
            conseillers.add(conseiller);
            return true;
        }else{
            return false;
        }
    }

//    public boolean removeConseiller(Conseiller conseiller){
//        //Todo not implemented : procédure lourde (gérer la répartition des clients sur d'autres conseillers -si c'est possible-)
//        return false;
//    }

    public boolean setGerant(Gerant gerant) {

        if(gerant != null){
            this.gerant = gerant;
            return true;
        }

        return false;
    }
}
