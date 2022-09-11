package observer;

public class SMSObserver implements Observer {
    Publisher publisher;
    static int stocks;
    private String mobileNo;

    public SMSObserver(String mobileNo, Publisher pub){
        this.mobileNo = mobileNo;
        this.publisher = pub;
    }

    @Override
    public void update() {
        System.out.println("Inside SMS Observer");
        publisher.getData();
    }

    public static void printMessage(int stocks){
        stocks = stocks;
        System.out.println("Inside print Message of SMS Observer, Stocks updated are - "+ stocks);
    }

    public Publisher getPublisher(){
        return this.publisher;
    }
}
