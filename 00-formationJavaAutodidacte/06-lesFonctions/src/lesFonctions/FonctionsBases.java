package lesFonctions;

public class FonctionsBases {

    // L'accessibilité de cette fonction : private : accessible que dans cette classe // public : accessible partout // protected : accessible par la class en question et les classes qui vont s'en servire
    // suivie de : static : car ma fonction main est en static.
    // suivie de : type retourné par la fonction : ex int.byte...
    // suivie de :  nom de la fonction
    // suivie de () pour les parametres et les acolades pour définir le block
    // Dans la fonction on exprime le return, TOUJOUR, il sera stocké dans le nom de la fonction son type doit concorder
    public static void  main(String[] args){
        //comment utiliser les fonctions?
        sendMessage("test", 2); // sans param il passe le message initié dans la fonction
        sendMessage(" ce texte est initié par un parametre de type string et un number : ", 5);
    }

    // on est hors de la methode Main, voici une fontion :
    private static void sendMessage(String message, int number){ //On appel les type et els parametres
        System.out.println("ceci est un petit message :" + message + number);  //on appel le nom de la variable du parametre
    }
}
