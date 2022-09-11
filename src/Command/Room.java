package Command;

public class Room implements HouseContruction{
    private HouseComponent HouseComponent;

    public Room(Command.HouseComponent houseComponent) {
        HouseComponent = houseComponent;
    }

    @Override
    public void execute() {
        HouseComponent.createRoom();
    }
}
