package abstract_Factory;

public class ChipsFactory extends SnacksFactory {
    Chips chips;

    public Chips prepare(String type, int quantity){
          if(type.equalsIgnoreCase("OnionChips")){
              chips = new OnionChips();
          }
          else if(type.equalsIgnoreCase("TomatoChips")){
              chips = new TomatoChips();
          }
        chips.construct(quantity);
        return chips;
    }

}
