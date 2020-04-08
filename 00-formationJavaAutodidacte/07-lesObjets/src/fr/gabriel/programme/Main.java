package fr.gabriel.programme;
// notre class principal qui nas nous permettre de créer un objet joueur
public class Main {
    public static void  main(String[] args) {

        Player player1 = new Player(); // on créer une variable Player sonNom = nouveau Player() instance de la class Joueur de notre objet
        System.out.println("le nom : "+ player1.getName()); // On get le nom
        System.out.println("la vie : "+ player1.getHealth());
        System.out.println("l'attack : "+ player1.getAttack());
    }
}
