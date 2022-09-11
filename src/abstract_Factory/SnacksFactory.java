package abstract_Factory;

public class SnacksFactory{

    public void supply(String type, int quantity) {
          if(type.contains("chips")){
             ChipsFactory factory = new ChipsFactory();
             factory.prepare(type, quantity);
          }

          else if(type.contains("biscuits")){
              BiscuitFactory factory = new BiscuitFactory();
              factory.prepare(type, quantity);
          }
    }

}
