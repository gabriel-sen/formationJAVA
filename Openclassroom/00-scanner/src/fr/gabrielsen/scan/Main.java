package fr.gabrielsen.scan;

import java.util.Scanner;

public class Main {
    // Ce program permet d'écouter le clavier grace au scanner et de stocker la frappe dans une variable String puis d'afficher son contenu grace à un sout.
    public static void main(String[] args) {
        Scanner nomScanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String motUtilisateur = nomScanner.nextLine();
        System.out.println("Vous avez écrit : " + motUtilisateur);
    }
}

