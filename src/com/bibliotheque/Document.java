package com.bibliotheque;

public class Document {

    // Attributs privés
    private String code;
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;
    private int nbExemplaires;

    public Document(String code, String titre, String auteur, int anneePublication, boolean disponible, int nbExemplaires) {
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = disponible;
        this.nbExemplaires = nbExemplaires;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public void setNbExemplaires(int nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }

    public void afficherInfo() {
        System.out.println("Code : " + code);
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Année de publication : " + anneePublication);
        System.out.println("Disponible : " + (disponible ? "Oui" : "Non"));
        System.out.println("Nombre d'exemplaires : " + nbExemplaires);
    }

}
