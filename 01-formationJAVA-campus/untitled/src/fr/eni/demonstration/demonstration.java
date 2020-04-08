package fr.eni.demonstration;

import java.util.Scanner; // la librairie est importée dès l'écriture de la fonction scaner

public class demonstration { // début de ma methode
    public static void main(String[] args){
        Scanner scannerElement = new Scanner(System.in); // On intialise la fonction scanner et on lui donne un nom

        System.out.println("Veuillez saisir un entier"); // on affiche la quetsion
        int premierEntier = scannerElement.nextInt(); // On utilise la fonction scanner et son résultat est stocké dans  la variable premierEntier

        System.out.println("Veuillez saisir un second entier "); // idem que l9 et 10
        int secondEntier = scannerElement.nextInt();

        int somme = premierEntier + secondEntier; // on calcule l'addition dans la variable somme qu'on affiche en dessous en concaténant le string avec la variable.
        System.out.println("La somme des entiers est égale à :" + somme);
    }
}// fin de ma methode
