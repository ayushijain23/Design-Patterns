package abstract_Factory;

public class TomatoChips implements Chips{
    @Override
    public void construct(int quantity) {
        System.out.println("Tomato Chips done:"+quantity);
    }
}
