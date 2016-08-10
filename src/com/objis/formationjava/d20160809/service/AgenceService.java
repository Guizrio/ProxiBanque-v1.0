package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.dao.AgenceDao;
import com.objis.formationjava.d20160809.domaine.Agence;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.Conseiller;
import com.objis.formationjava.d20160809.domaine.Gerant;

import java.util.List;

/**
 * Created by Guillaume on 10/08/2016.
 */
public class AgenceService {

    private AgenceDao agenceDao = new AgenceDao();

    public List<Agence> getAllAgence(){
        return agenceDao.getAllAgence();
    }

    public Agence getAgenceOfGerant(Gerant gerant){
        return agenceDao.getAgenceOfGerant(gerant);
    }

    public void addConseiller(Agence agence, Conseiller conseiller){
        agence.addConseiller(conseiller);
        agenceDao.update(agence);
    }

    public void addClient(Agence agence, Client client){
        agence.addClient(client);
        agenceDao.update(agence);
    }

}
