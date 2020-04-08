/*

 */
package fr.eni.demonstration;

import java.util.Scanner;

/*
  @author salut

 */
public class HelloWorld {

    /*
      @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String saisie;
        System.out.println("Saisir un nom");
        Scanner sc = new Scanner(System.in);
        saisie = sc.nextLine();
        System.out.println("le nom saisie est " + saisie);
    }

}