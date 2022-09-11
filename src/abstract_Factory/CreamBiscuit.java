package abstract_Factory;

public class CreamBiscuit implements Biscuit{

    @Override
    public void construct(int quantity) {
        System.out.println("Cream Biscuits done:"+quantity);
    }
}
