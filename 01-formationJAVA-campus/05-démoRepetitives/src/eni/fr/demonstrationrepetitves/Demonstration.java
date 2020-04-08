package eni.fr.demonstrationrepetitves;

public class Demonstration {

    public static void  main(String[] args) {

        int compteur = 1;

        System.out.println("La boucle While ");
        while (compteur <=5) {
            System.out.println("La valeur de compteur est de " + compteur);
            compteur++;
        }

        System.out.println("La boucle do ");
        do {
            System.out.println("La valeur de compteur est de " + compteur);
            compteur++;
        } while (compteur <= 5);
        
        System.out.println("La boucle for ");
        for(int compteur = 1; compteur <= 5; compteur++){
            System.out.println("La valeur de compteur est de " + compteur);
        }
    }
}
