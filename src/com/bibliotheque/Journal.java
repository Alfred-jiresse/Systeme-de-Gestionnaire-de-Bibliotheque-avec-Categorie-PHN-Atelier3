package com.bibliotheque;

import java.time.LocalDate; // pour la date de parution

public class Journal extends Document {

    // Attribut spécifique
    private LocalDate dateParution;

    // Constructeur
    public Journal(String code, String titre, String auteur, int anneePublication,
                   boolean disponible, int nbExemplaires, LocalDate dateParution) {
        super(code, titre, auteur, anneePublication, disponible, nbExemplaires);
        this.dateParution = dateParution;
    }

    // Getter et Setter
    public LocalDate getDateParution() {
        return dateParution;
    }

    public void setDateParution(LocalDate dateParution) {
        this.dateParution = dateParution;
    }

    // Méthode pour afficher les informations du journal
    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Date de parution : " + dateParution);
    }
}
