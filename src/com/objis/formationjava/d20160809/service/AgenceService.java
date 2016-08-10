package com.objis.formationjava.d20160809.service;

import com.objis.formationjava.d20160809.domaine.Adresse;
import com.objis.formationjava.d20160809.domaine.Agence;
import com.objis.formationjava.d20160809.utils.MyRandomizer;

import java.time.LocalDateTime;

/**
 * Created by Stagiaire on 10/08/2016.
 */
public class AgenceService {

    public Agence createAgence(){
        return new Agence(String.valueOf(MyRandomizer.generateInt(6)),
                LocalDateTime.now(),
                new Adresse("adresse_" + MyRandomizer.generate(5),
                MyRandomizer.generateCodePostal(),
                "ville_" + MyRandomizer.generate(5)),
                new GerantService().createGerant());
    }




}
