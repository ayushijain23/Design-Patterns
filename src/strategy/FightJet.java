package strategy;

public class FightJet implements FlyingMachine{
    FlyingStrategy strategy;

    public FightJet(FlyingStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void fly() {
        strategy.flyingWay();
    }
}
