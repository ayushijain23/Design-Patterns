package strategy;

public class Aeroplane implements FlyingMachine{
    FlyingStrategy strategy;

    public Aeroplane(FlyingStrategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void fly() {
        strategy.flyingWay();
    }
}
