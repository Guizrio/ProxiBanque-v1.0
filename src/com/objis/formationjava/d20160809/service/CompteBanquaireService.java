package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.dao.CompteBanquaireDao;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.CompteBanquaire;

import java.util.List;

/**
 * Created by Guillaume on 09/08/2016.
 */
public class CompteBanquaireService {

    private CompteBanquaireDao compteBanquaireDao = new CompteBanquaireDao();

    public List<CompteBanquaire> getAllCompteBanquaire() {
        return compteBanquaireDao.getAllCompteBanquaire();
    }

    public List<CompteBanquaire> getComptesBanquairesOfClient(Client client){
       return null;
    }

}
