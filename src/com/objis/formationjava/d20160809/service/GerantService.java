package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Adresse;
import com.objis.formationjava.d20160809.domaine.Gerant;
import com.objis.formationjava.d20160809.utils.MyRandomizer;

/**
 * Created by Stagiaire on 10/08/2016.
 */
public class GerantService {

    public Gerant createGerant(){
        return new Gerant("nom_" + MyRandomizer.generate(7), "prenom_" + MyRandomizer.generate(7),
                new Adresse("adresse_" + MyRandomizer.generate(5),
                        MyRandomizer.generateCodePostal(),
                        "ville_" + MyRandomizer.generate(5)), MyRandomizer.generatePhone());
    }



}
