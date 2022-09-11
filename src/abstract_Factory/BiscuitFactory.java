package abstract_Factory;

public class BiscuitFactory extends SnacksFactory{
    Biscuit biscuit;

    public Biscuit prepare(String type, int quantity){
        if(type.equalsIgnoreCase("CreamBiscuits")){
            biscuit = new CreamBiscuit();
        }
        else if(type.equalsIgnoreCase("OreaBiscuits")){
            biscuit = new OreaBiscuit();
        }
        biscuit.construct(quantity);
        return biscuit;
    }
}
