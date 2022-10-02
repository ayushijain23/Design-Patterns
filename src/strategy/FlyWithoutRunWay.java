package strategy;

public class FlyWithoutRunWay implements FlyingStrategy{

    @Override
    public void flyingWay() {
        System.out.println("It flies in air and can land anywhere");
    }
}
