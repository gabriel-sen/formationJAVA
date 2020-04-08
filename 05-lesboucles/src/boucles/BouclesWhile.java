package boucles;
    /* TODO : a apprendre par coeur
    byte -138 to 127
    short from -32768 to 32767
    int -2M1 to 2M1
    long -9 Quintillion to 9 quintillion
    */
public class BouclesWhile {
    public static void  main(String[] args){ //Boucle tant-que
        byte i = 0;

        while(i != 127){
            System.out.println("execute jusqu'à 126 : " + i);
            i++;
        }
    }
}
