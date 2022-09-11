package abstract_Factory;

public class OnionChips implements Chips{
    @Override
    public void construct(int quantity) {
        System.out.println("Onion Chips done:"+quantity);
    }
}
