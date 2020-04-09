package fr.heritage.programme;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 *
 *
 * PARTIE 2 )
 * 1) On as crée une class publique Apple suivie de "extend de Fruit"
 * 2) En passant la souris sur le nom de la la class ou on vas chercher les methodes, ici, Fruit on extend les methodes.
 *3 ) Tu crée une méthode miam dans la class fruit
 * 4) Tue reviens et tu peux y acceder grace à la fonctionnalité super.xx
 *
 */
public class Apple extends Fruit{
    @Override
    public void tast(){
        System.out.println("La pomme est sucrée"); // Le String correspond
        super.miam(); // on as accès à une methode écrite dans une autre class à condition qu'elle soit extends
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
