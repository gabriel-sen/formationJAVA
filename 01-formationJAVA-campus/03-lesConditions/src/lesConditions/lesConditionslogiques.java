package lesConditions;

import java.util.Scanner;

public class lesConditionslogiques {
    public static void main(String[] args){
        Scanner scannerElement = new Scanner(System.in);
        int age = 18;
        boolean majeur = false;

        System.out.println("Veuillez saisir votre age");
        int ageUser = scannerElement.nextInt();

        if (ageUser > age){
            majeur = true;
            System.out.println(majeur);
        } else {
            majeur = false;
            System.out.println(majeur);
        }
    }
}
