package strategy;

public class Helicopter implements FlyingMachine {
    FlyingStrategy strategy;

    public Helicopter() {
    }

    public Helicopter(FlyingStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void fly() {
        strategy.flyingWay();
    }

    public void flyBySetterMethod(FlyingStrategy newStrategy){
        newStrategy.flyingWay();
    }
}
