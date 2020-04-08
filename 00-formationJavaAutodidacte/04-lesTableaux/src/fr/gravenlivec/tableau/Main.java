package fr.gravenlivec.tableau;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /* TODO : GSE - stoker et afficher le contenu d'un tableau
        String[] names = {"Igor","paul","igor"}; // On affiche  un tableau de type String nommé names avec 3 valeurs
        // System.out.println(" il s'appel "+ names[1]); // On affiche la variable par le nom du tableau
        if(names[0].equalsIgnoreCase(names[2])){
            System.out.println("Ils sont égaux");
        } else {
            System.out.printf("Ils ne sont pas égaux");
        }
         */
        /* TODO : GSE - les tableau avec des éléments de type number
        int [] numbers = { 12, 7, 13};
        int calcul = (numbers[0] + numbers[1]+numbers[2]) / numbers.length;
        System.out.println(calcul);
         */
        /* TODO : GSE les tableaux contenant des tableaux
        int numbers[][] = { //on ouvre le tableau
                { // premier tableau
                    5, 7, 8
                },
                {// second tableau
                    9, 10, 11
                },
                {// troisiem tableau
                    12, 13, 14
                }
        };
        System.out.println(numbers[1][1]);

         */
        /* TODO : GSE TRansforemer une suite de String en Tableaux*/
        String psedoliste = "kaylar, Nrok, andrébouchet, nixnos";
        String psedoTab[] = psedoliste.split(",");
        System.out.println(psedoTab.length);
    }
}
