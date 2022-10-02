package strategy;

public class DeviceStrategy implements FlyingStrategy{
    @Override
    public void flyingWay() {
        System.out.println("Physical device flying");
    }
}
