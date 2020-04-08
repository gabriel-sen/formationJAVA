package boucles;

public class BoucleDoWhile {
    public static void  main(String[] args){

        // la boucle s'éxécuteras au moins une fois tant que la condition 'est pas remplie
        byte condition = 0;

        do{
            condition++;
            System.out.println("voici les itérations" + condition);
        } while (condition != 110);

    }
}
