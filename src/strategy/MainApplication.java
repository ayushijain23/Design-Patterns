package strategy;

public class MainApplication {
    public static void main(String[] args) {
        FlyingMachine aeroplane = new Aeroplane(new FlyOnRunWay());
        aeroplane.fly();

        FlyingMachine fightjet = new FightJet(new FlyOnRunWay());
        fightjet.fly();

        FlyingMachine helicopter = new Helicopter(new FlyWithoutRunWay());
        helicopter.fly();

        Drone drone = new Drone(new FlyWithoutRunWay());
        drone.fly();

        drone.setStrategy(new DeviceStrategy());
        drone.fly();

        Helicopter helicopter2 = new Helicopter();
        System.out.println("By Setter Method-");
        helicopter2.flyBySetterMethod(new FlyWithoutRunWay());
    }
}
