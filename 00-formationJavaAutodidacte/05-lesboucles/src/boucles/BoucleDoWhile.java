package boucles;
    /* TODO : a apprendre par coeur
    byte -138 to 127
    short from -32768 to 32767
    int -2M1 to 2M1
    long -9 Quintillion to 9 quintillion
    */
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
