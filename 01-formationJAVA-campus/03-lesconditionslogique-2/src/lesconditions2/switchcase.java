package lesconditions2;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner scannerElement = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier"); // on affiche la quetsion
        int jour = scannerElement.nextInt();

        switch(jour){
            case 1:System.out.println("Lundi");
            break;
            case 2:System.out.println("mardi");
            break;
            case 3:System.out.println("mercredi");
            break;
            case 4:System.out.println("jeudi");
            break;
            case 5:System.out.println("vendredi");
            break;
            case 6:System.out.println("samedi");
            break;
            case 7:System.out.println("dimanche");
            break;
            default:System.out.println("Erreur") ;
            break;
        }
    }
}
