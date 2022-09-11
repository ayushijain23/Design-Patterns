package decorator;

public class FarmHousePizza extends PizzaBase{

    @Override
    public int cost() {
        return 150;
    }

    @Override
    public void printDetails() {
        System.out.println("its FarmHouse pizza !");
    }
}
