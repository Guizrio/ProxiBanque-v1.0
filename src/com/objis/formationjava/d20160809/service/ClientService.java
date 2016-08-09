package com.objis.formationjava.d20160809.service;

import java.util.*;

import com.objis.formationjava.d20160809.DAO.ClientDAO;
import com.objis.formationjava.d20160809.domaine.Client;
import com.objis.formationjava.d20160809.domaine.Conseiller;

/**
 * Created by Stagiaire on 09/08/2016.
 */


public class ClientService {

	
	ClientDAO clientDAO1=new ClientDAO();
	public Set<Client> getAllClientAgence(){
		
		return clientDAO1.getAllClientAgence();
	}
	
	
	public Set<Client> getAllClientDuConseiller(Conseiller conseiller){
		
		return clientDAO1.getAllClientDuConseiller(conseiller);
	}

}