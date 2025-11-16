package com.bibliotheque;

public class Livre extends Document {

    // Attribut spécifique
    private int nbPages;

    // Constructeur
    public Livre(String code, String titre, String auteur, int anneePublication,
                 boolean disponible, int nbExemplaires, int nbPages) {
        super(code, titre, auteur, anneePublication, disponible, nbExemplaires);
        this.nbPages = nbPages;
    }

    // Getter et Setter pour nbPages
    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    // Méthode pour afficher les informations du livre
    @Override
    public void afficherInfo() {
        super.afficherInfo(); // affiche les infos communes
        System.out.println("Nombre de pages : " + nbPages);
    }
}

