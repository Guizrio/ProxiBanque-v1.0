package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.dao.ClientDao;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.CompteBanquaire;

import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ClientService {

    private ClientDao clientDao = new ClientDao();

    public List<Client> getAllClient(){
        return clientDao.getAllClient();
    }

    public Client readClient(Client client){
        return null;
    }

    public Client getClientOfCompteBanquaire(CompteBanquaire compteBanquaire){
       return clientDao.getClientOfCompteBanquaire(compteBanquaire);
    }

}
