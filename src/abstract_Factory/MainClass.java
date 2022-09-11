package abstract_Factory;

public class MainClass {
    public static void main(String[] args) {
        SnacksFactory snacksFactory =  new SnacksFactory();
        snacksFactory.supply("onionchips", 5);
        snacksFactory.supply("Oreabiscuits", 10);

        snacksFactory.supply("tomatochips", 6);
        snacksFactory.supply("creambiscuits", 20);
    }
}
