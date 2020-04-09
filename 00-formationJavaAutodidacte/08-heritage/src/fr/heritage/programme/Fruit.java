package fr.heritage.programme;
/**
 *
 * L'obectif de cette super classe est de comprendre ela notion dh'éritage.
 *Cela consiste à concevoir une class qui héritera des points communs qu'il auras avec d'autres objets
 *Par exemple, deux fruits, pomme, ananas, ils ont des caracteristiques comunes, des pépins ou non, un gout, un nom mais ils sont bien des Fruits.
 * Nous allons regrouper dans cette superClass les points en communs de ces deux fruits.
 *
 * PARTIE 1) On définie la super class Fruit
 * PARTIE 2) On créer une class Apple ATTENTION a y implementer les methodes
 *
 * */
public abstract class Fruit {
    // on créer une class abstraite, on y liste des methodes à re-définir au moment de la génération de la class Apple et Ananas qui héritera des methodes de  Fruit

        public abstract void tast(); // void car on vas le re-définir
        public abstract int getSize(); // un int pour sa taille
        public abstract boolean hasSeed(); // un booleen pour si il as des pépins ou pas

        public void miam(){ // cette methode sera accessible à toute ceux qui héritent de Fruits car elle n'a pas "abstract"
                System.out.println("Miam manger ");
        }
}
