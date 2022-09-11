package abstract_Factory;

public class OreaBiscuit implements Biscuit{
    @Override
    public void construct(int quantity) {
        System.out.println("Oreo Biscuits done:"+ quantity);
    }
}
