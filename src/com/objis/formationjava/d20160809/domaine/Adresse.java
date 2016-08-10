package com.objis.formationjava.d20160809.domaine;

/**
 * Classe permettant de créer des objets Adresse.
 * <p>
 * Une adresse est composée de 3 chaîne de caractères: un nom de ville, un code postal, une adresse locale.
 * 
 * @author Guillaume et Vincent
 */
public class Adresse {

    private String adresse;
    private String codePostal;
    private String ville;

    /**
     * Constructeur d'adresse a partir d'un nom de ville, d'un code postal, d'une adresse locale.
     * @param adresse  adresse locale
     * @param codePostal code postal
     * @param ville nom de ville
     */
    public Adresse(String adresse, String codePostal, String ville) {
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
