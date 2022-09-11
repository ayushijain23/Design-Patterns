package Factory;

public class Customer {

    public static void main(String args[]){
      int myBill = 0;
      int TVCost = GadgetFactory.getGadgetPrice("TV");
      int FridgeCost = GadgetFactory.getGadgetPrice("Fridge");

      System.out.println("TV: "+ TVCost);
      System.out.println("Fridge: "+FridgeCost);

      myBill+= GadgetFactory.getPriceByProperty("summer");
      myBill+= GadgetFactory.getPriceByProperty("animation");

      System.out.println("Total Bill: "+myBill);

    }
}
