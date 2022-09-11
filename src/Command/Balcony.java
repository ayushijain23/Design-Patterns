package Command;

public class Balcony implements HouseContruction{
    private HouseComponent HouseComponent;

    public Balcony(Command.HouseComponent houseComponent) {
        HouseComponent = houseComponent;
    }

    @Override
    public void execute() {
        HouseComponent.createBalcony();
    }
}
