package strategy;

public class FlyOnRunWay implements FlyingStrategy{

    @Override
    public void flyingWay() {
        System.out.println("It flies in air and lands on runway");
    }
}
