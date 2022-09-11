package decorator;

public class MainApplication {
    public static void main(String[] args) {
        PizzaBase pizza = new Magherita();
        System.out.println(pizza.cost());

        PizzaBase withCheesePizza = new ExtraCheese(pizza);
        System.out.println(withCheesePizza.cost());

        PizzaBase withCheeseAndPannerPizza = new ExtraPaneer(new ExtraCheese(new VegiePizza()));
        System.out.println(withCheeseAndPannerPizza.cost());
        withCheeseAndPannerPizza.printDetails();
    }
}
