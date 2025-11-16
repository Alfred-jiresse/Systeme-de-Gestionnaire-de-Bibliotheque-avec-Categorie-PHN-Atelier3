package com.bibliotheque;

public class Disque extends Document {

    // Attributs spécifiques
    private int duree; // en minutes
    private String typeDisque; // CD ou DVD

    // Constructeur
    public Disque(String code, String titre, String auteur, int anneePublication,
                  boolean disponible, int nbExemplaires, int duree, String typeDisque) {
        super(code, titre, auteur, anneePublication, disponible, nbExemplaires);
        this.duree = duree;
        this.typeDisque = typeDisque;
    }

    // Getters et Setters
    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getTypeDisque() {
        return typeDisque;
    }

    public void setTypeDisque(String typeDisque) {
        this.typeDisque = typeDisque;
    }

    // Méthode pour afficher les informations du disque
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Durée : " + duree + " minutes");
        System.out.println("Type : " + typeDisque);
    }
}
