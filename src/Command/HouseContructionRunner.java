package Command;

public class HouseContructionRunner {
   public static void main(String[] args) {
      HouseContruction roofConstruction = new Roof(new HouseComponent("50", "100"));
      HouseContruction roomConstruction  = new Room(new HouseComponent("20", "50"));
      HouseContruction balconyConstruction = new Balcony(new HouseComponent("10", "15"));

      System.out.println("Roof created:");
      roofConstruction.execute();

      System.out.println("Room created:");
      roomConstruction.execute();

      System.out.println("Balcony created:");
      balconyConstruction.execute();

      //with Additional Executor class
      ConstructionExecutor executor = new ConstructionExecutor();
      executor.executeConstruction(new Roof(new HouseComponent("1000","2000")));
      executor.executeConstruction(new Room(new HouseComponent("500","800")));
      executor.executeConstruction(new Balcony(new HouseComponent("100","200")));
   }




}
