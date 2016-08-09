package com.objis.formationjava.d20160809.domaine;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public class Agence {

    private String id;
    private LocalDateTime dateCreation;
    private Adresse adresse;
    private Gerant gerant;
    List<Conseiller> conseillers;
    
    
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the dateCreation
	 */
	public LocalDateTime getDateCreation() {
		return dateCreation;
	}
	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * @return the gerant
	 */
	public Gerant getGerant() {
		return gerant;
	}
	/**
	 * @param gerant the gerant to set
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
    
	/**
	 * @return the conseillers
	 */
    public List<Conseiller> getConseillers() {
		return conseillers;
	}
	/**
	 * @param conseillers the conseillers to set
	 */
	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
    
    

}
