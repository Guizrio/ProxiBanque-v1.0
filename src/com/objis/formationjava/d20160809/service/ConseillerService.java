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

    private ConseillerDao conseillerDao = new ConseillerDao();

    public List<Conseiller> getAllConseiller(){return conseillerDao.getAllConseiller();}

    public List<Conseiller> getAllConseillerOfAgence(Agence agence){
        return conseillerDao.getAllConseiller(agence);
    }

    public Agence getAgenceOfConseiller(Conseiller conseiller){
        return conseillerDao.getAgenceOfConseiller(conseiller);
    }

    public void addClient(Agence agence, Conseiller conseiller, Client client){
        new AgenceService().addClient(agence, client);
        conseiller.addClient(client);

        Conseiller conseiller1 = getConseillerOfClient(client);

        if(conseiller1 != null){
            conseiller1.removeClient(client);
            conseillerDao.update(conseiller1);
        }

        conseillerDao.update(conseiller);
    }


    public void removeClientFromConseiller(Conseiller conseiller, Client client){
        conseiller.removeClient(client);
        conseillerDao.update(conseiller);
    }

    public Conseiller getConseillerOfClient(Client client){
        return conseillerDao.getConseillerOfClient(client);
    }


}
