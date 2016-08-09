package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.dao.ConseillerDao;
import com.objis.formationjava.d20160809.domaine.Agence;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.Conseiller;

import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class ConseillerService {

    ConseillerDao conseillerDao = new ConseillerDao();

    public List<Conseiller> getAllConseiller(Agence agence){
        return conseillerDao.getAllConseiller(agence);
    }

    public List<Conseiller> getAllConseiller(){
        return conseillerDao.getAllConseiller();
    }

    public Agence getAgenceOfConseiller(Conseiller conseiller){
        return conseillerDao.getAgenceOfConseiller(conseiller);
    }

    public void addClient(Agence agence, Conseiller conseiller, Client client){
        new AgenceService().addClient(agence, client);
        conseiller.addClient(client);
        conseillerDao.update(conseiller);
    }

}
