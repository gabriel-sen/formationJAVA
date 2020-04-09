package fr.gabriel.programme;
// notre class principal qui nas nous permettre de créer un objet joueur
public class Main {
    public static void  main(String[] args) {
        // on créer une variable Player sonNom = nouveau Player() instance de la class Joueur pour le créer
        Player player1 = new Player("Igor", 100, 300); //On place des parametres du constructeur
        System.out.println("Joueur 1");
        System.out.println("le nom : "+ player1.getName()); // On get le nom
        System.out.println("la vie : "+ player1.getHealth());
        System.out.println("l'attack : "+ player1.getAttack());
        player1.damage(12);
        System.out.println("la vie après domage: "+ player1.getHealth());

        System.out.println("Joueur 2");
        Player player2 = new Player("Jozé" , 100, 140);
        System.out.println("le nom : "+ player2.getName()); // On get le nom
        System.out.println("la vie : "+ player2.getHealth());
        System.out.println("l'attack : "+ player2.getAttack());
        player2.damage(player1.getAttack());
        System.out.println("la vie : "+ player2.getHealth());

        if(player2.getHealth() <= 0){
            System.out.println("player 2 est mort");
        } else {
            System.out.println("player 2 est vivant");
        }
        if(player1.getHealth() <= 0){
            System.out.println("player 1 est ");
        } else {
            System.out.println("player 1 est vivant");
        }
    }
}
