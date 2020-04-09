package fr.heritage.programme;

public class Ananas extends Fruit{
    @Override
    public void tast() {
        System.out.println("L'ananas est délicieux!");
    }

    @Override
    public int getSize() {
        return 5;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
