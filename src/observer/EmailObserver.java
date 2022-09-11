package observer;

public class EmailObserver implements Observer{
    private Publisher publisher;
    private static int stocks;
    private String emailId;

    public EmailObserver(String emailId, Publisher pub){
        this.emailId = emailId;
        this.publisher = pub;
    }

    @Override
    public void update() {
        System.out.println("Inside EmailObserver");
        publisher.getData();
    }

    public static void printMessage(int stocks){
        stocks = stocks;
        System.out.println("Inside print Message of Email Observer, Stocks updated are - "+ stocks);
    }

    public Publisher getPublisher(){
        return this.publisher;
    }
}
