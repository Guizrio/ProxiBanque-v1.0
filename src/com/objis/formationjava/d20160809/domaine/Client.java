package com.objis.formationjava.d20160809.domaine;

import com.objis.formationjava.d20160809.exceptions.ImpossibleLinkException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class Client extends Contact implements Idebiteur {

    private List<CompteBanquaire> listeCompteBanquaires;
    private List<CarteBanquaire> carteBanquaires;
    private List<Placement> placements;



    public Client(String nom) {
        super(nom);
        initEmpty();
    }


    public Client(String nom, Adresse adresse, String telephone) {
        super(nom, adresse, telephone);
        initEmpty();
    }


    private void initEmpty(){
        listeCompteBanquaires = new ArrayList<>();
        carteBanquaires = new ArrayList<>();
        placements = new ArrayList<>();
    }




    public List<CompteBanquaire> getListeCompteBanquaires() {
        return listeCompteBanquaires;
    }

    public List<CarteBanquaire> getCarteBanquaires() {
        return carteBanquaires;
    }

    public List<Placement> getPlacements() {
        return placements;
    }

    public void addPlacement(Placement placement){
        placements.add(placement);
    }


    //Todo vérifier la validité de la méthode
    public boolean addCompteBanquaire(CompteBanquaire compteBanquaire) throws ImpossibleLinkException{
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

        throw new ImpossibleLinkException("Impossible de relier le compte banquaire au client");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (listeCompteBanquaires != null ? !listeCompteBanquaires.equals(client.listeCompteBanquaires) : client.listeCompteBanquaires != null)
            return false;
        if (carteBanquaires != null ? !carteBanquaires.equals(client.carteBanquaires) : client.carteBanquaires != null)
            return false;
        return placements != null ? placements.equals(client.placements) : client.placements == null;

    }

    @Override
    public int hashCode() {
        int result = listeCompteBanquaires != null ? listeCompteBanquaires.hashCode() : 0;
        result = 31 * result + (carteBanquaires != null ? carteBanquaires.hashCode() : 0);
        result = 31 * result + (placements != null ? placements.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + getNom() + '\'' +
                ", adresse=" + getAdresse() +
                ", telephone='" + getTelephone() + '\'' +
                ", listeCompteBanquaires=" + listeCompteBanquaires +
                ", carteBanquaires=" + carteBanquaires +
                ", placements=" + placements +
                '}';
    }

    public String alternateToString(){
        return "\tClient{" +
                "nom='" + getNom() + '\'' +
                ", adresse=" + getAdresse() +
                '}';
    }
}
