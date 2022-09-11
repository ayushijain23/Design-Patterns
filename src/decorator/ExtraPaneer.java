package decorator;

public class ExtraPaneer extends Decorator{
    PizzaBase pizzaBase;

    public ExtraPaneer(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public int cost() {
        return pizzaBase.cost() + 50;
    }

    public void printDetails() {
        System.out.println(pizzaBase.getClass().getName()+"its with extra Paneer");
    }
}
