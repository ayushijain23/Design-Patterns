package Command;

public class HouseComponent {
    private String length;
    private String width;

    public HouseComponent(String len, String width) {
        this.length = len;
        this.width = width;
    }

    public void createRoof(){
        System.out.println("Roof is created with Length : "+this.length+" And width: "+ this.width);
    }

    public void createRoom(){
        System.out.println("Room is created with Length : "+this.length+" And width: "+ this.width);
    }

    public void createBalcony(){
        System.out.println("Balcony is created with Length : "+this.length+" And width: "+ this.width);
    }

}
