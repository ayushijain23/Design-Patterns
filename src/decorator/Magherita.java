package decorator;

public class Magherita extends PizzaBase{

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public void printDetails() {
        System.out.println("its Magherita pizza !");
    }
}
