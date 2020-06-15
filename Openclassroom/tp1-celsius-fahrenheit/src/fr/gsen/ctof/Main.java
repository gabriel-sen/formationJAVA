package fr.gsen.ctof;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char continueOrNot = ' ';
        int celsusChoice = 2;
        int fahrenheitChoice = 1;
        Scanner choice = new Scanner(System.in);

        System.out.println("Convertisseur Celsus - Fahrenheit, tappez 1");
        System.out.println("Convertisseur Fahrenheit - Celsus, tappez 2");
        int choiceUser = choice.nextInt();

        do{
                if(choiceUser == fahrenheitChoice ){
                    Scanner userFahren = new Scanner(System.in);
                    System.out.println("Entrez votre température en fahrenheight");
                    double uservalue = userFahren.nextDouble();
                    double farenResult = ((uservalue - 32) / 1.8);
                    System.out.println("La conversion de fahrenheight en celsusest : " + farenResult);

                } else if(choiceUser == celsusChoice){
                    Scanner userCelsus = new Scanner(System.in);
                    System.out.println("Entrez votre température en fahrenheight");
                    double uservalue = userCelsus.nextDouble();
                    double celResult = (uservalue * 9/5) + 32;
                    System.out.println("La conversion de celsius en fahrenheight : " + celResult);
                }

            System.out.println("Voulez-vous continuer O/N");
            Scanner sc = new Scanner(System.in);
            continueOrNot = sc.nextLine().charAt(0);
        }while(continueOrNot != 'N');
        System.out.println("Aurvoir");

    }
}
