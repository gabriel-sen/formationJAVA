public class premiereVariables { // on définie une class et son nom
    //Zone de déclaration d'une variable Global
    static int nombreGlobal = 130;

    public static void main(String[] args){ // procédure/ méthode principal main
        // on préfère déclarer les variables locales en tête de la procédure main
        int nombre = 10;
        if (nombre == 10){
            char lettre = 'A'; // char est une variable de type Caractère
            System.out.println("Valeur du combre global = " + nombreGlobal); // la variable nombre Global est utilisable car es une variable global
            System.out.println("Valeur du combre = " + nombre); // la variable nombre est utilisable dans cette instruction car déclaré dans la methode parent
            System.out.println("Valeur de la lettre = " + lettre); // je peux utiliser la variable lettre car déclaré dans ce bloc d'instruction
        }

        System.out.println("--------------On vas afficher plusieurs valeurs par la suite ------");

            boolean estPremier = true;

            int index = 0;
            System.out.println(index);

            long nombreDeGrains = 500l ; // la valeur de type long doit finir par un l
            System.out.println(nombreDeGrains);

            float taillePaquet = 51.20f;
            System.out.println(taillePaquet); // la valeur de type float doit finir par un f

            double tailleTour = 105.9;
            System.out.println(taillePaquet);

            char belleLettre ='A';
            System.out.println(belleLettre);

            String bellePhrase = "Tada";
            System.out.println(bellePhrase);


        System.out.println("-------------- Transoformer le type d ela varianbble ------");

    } // fin de la methode main
} // fin de la class
