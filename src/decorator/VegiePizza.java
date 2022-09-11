package decorator;

public class VegiePizza extends PizzaBase{

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public void printDetails() {
        System.out.println("its Veg pizza !");
    }
}
