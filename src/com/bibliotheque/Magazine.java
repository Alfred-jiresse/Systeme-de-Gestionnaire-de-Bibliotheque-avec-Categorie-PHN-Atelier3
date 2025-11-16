package com.bibliotheque;

public class Magazine extends Document {

    // Attribut spécifique
    private int numeroEdition;

    // Constructeur
    public Magazine(String code, String titre, String auteur, int anneePublication,
                    boolean disponible, int nbExemplaires, int numeroEdition) {
        super(code, titre, auteur, anneePublication, disponible, nbExemplaires);
        this.numeroEdition = numeroEdition;
    }

    // Getter et Setter
    public int getNumeroEdition() {
        return numeroEdition;
    }

    public void setNumeroEdition(int numeroEdition) {
        this.numeroEdition = numeroEdition;
    }

    // Méthode pour afficher les informations du magazine
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Numéro d'édition : " + numeroEdition);
    }
}
