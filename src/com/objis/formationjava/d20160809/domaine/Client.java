package com.objis.formationjava.d20160809.domaine;

import java.util.List;

/**
 * Created by Stagiaire on 09/08/2016.
 */
public abstract class Client extends Contact {

	List<CompteBanquaire> listeCompteBanquaires;
	List<CarteBanquaire> listeCarteBanquaires;
	List<Placement> placements;
	Conseiller conseiller;
	
	
	
	public boolean removeCarteBancaire(CarteBanquaire carteBanquaire) {
		return this.listeCarteBanquaires.remove(carteBanquaire);
	}


	public boolean addCarteBanquaire(CarteBanquaire carteBanquaire) {
		int nbMemeClass = 0;


		if (listeCarteBanquaires != null) {

			for (CarteBanquaire carte : this.listeCarteBanquaires) {
				if (carte.getClass() == carteBanquaire.getClass()) {
					nbMemeClass++;
				}
			}
		}

		if (nbMemeClass < 1) {
			return listeCarteBanquaires.add(carteBanquaire);
		} else {
			return false;
		}

	}
	
	
	
	
	public boolean removeCompteBancaire(CompteBanquaire compteBanquaire) {
		return this.listeCompteBanquaires.remove(compteBanquaire);
	}

	
	/**
	 * ajoute un compte banquaire a la liste des compte du client 
	 * en assurant que le client ne possede qu un compte de chaque type
	 * @param compteBanquaire
	 * @return
	 */
	//Todo vérifier validité de la fonction
	public boolean addCompteBanquaire(CompteBanquaire compteBanquaire) {
		int nbMemeClass = 0;

		if (listeCompteBanquaires != null) {

			for (CompteBanquaire compte : this.listeCompteBanquaires) {
				if (compte.getClass() == compteBanquaire.getClass()) {
					nbMemeClass++;
				}
			}
		}

		if (nbMemeClass < 1) {
			return listeCompteBanquaires.add(compteBanquaire);
		} else {
			return false;
		}

	}

    public List<CompteBanquaire> getListeCompteBanquaires() {
        return listeCompteBanquaires;
    }

    public List<CarteBanquaire> getCarteBanquaires() {
        return listeCarteBanquaires;
    }

    public Conseiller getConseiller() {
        return conseiller;
    }


    public void setConseiller(Conseiller conseiller) {
        this.conseiller = conseiller;
    }

    public boolean hasConseiller(){
        return conseiller != null;
    }

}
