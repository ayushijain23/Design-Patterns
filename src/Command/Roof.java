package Command;

public class Roof implements HouseContruction{

    private HouseComponent houseComponent;

    public Roof(HouseComponent houseComponent) {
        this.houseComponent = houseComponent;
    }

    @Override
    public void execute() {
        houseComponent.createRoof();
    }
}
