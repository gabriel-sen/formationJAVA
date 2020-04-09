package fr.heritage.programme;

public class Banana extends Fruit {

    @Override
    public void tast() {
        System.out.println("C'est bon, mais sans plus");
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
