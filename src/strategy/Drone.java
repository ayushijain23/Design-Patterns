package strategy;

public class Drone implements FlyingMachine{
    FlyingStrategy strategy;

    public Drone(FlyingStrategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void fly() {
        strategy.flyingWay();
    }

    public FlyingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(FlyingStrategy strategy) {
        this.strategy = strategy;
    }
}
