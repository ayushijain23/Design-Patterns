package decorator;

public class ExtraCheese extends Decorator{
    PizzaBase pizzaBase;

    public ExtraCheese(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public int cost() {
        return pizzaBase.cost() + 30;
    }

    public void printDetails() {
        System.out.println(pizzaBase.getClass().getName()+"its with extra cheese");
    }
}
