package com.bibliotheque;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Création d'un Livre
        Livre livre1 = new Livre("L001", "Les Misérables", "Victor Hugo", 1862, true, 5, 1232);

        // Création d'un Magazine
        Magazine mag1 = new Magazine("M001", "Science et Vie", "Redaction", 2025, true, 10, 45);

        // Création d'un Journal
        Journal journal1 = new Journal("J001", "Le Monde", "Rédaction", 2025, true, 20, LocalDate.of(2025, 11, 16));

        // Création d'un Disque
        Disque disque1 = new Disque("D001", "Thriller", "Michael Jackson", 1982, true, 3, 42, "CD");

        // Affichage des informations
        System.out.println("Livre");
        livre1.afficherInfo();
        System.out.println();

        System.out.println("Magazine");
        mag1.afficherInfo();
        System.out.println();

        System.out.println("Journal");
        journal1.afficherInfo();
        System.out.println();

        System.out.println("Disque");
        disque1.afficherInfo();
        System.out.println();
    }
}
