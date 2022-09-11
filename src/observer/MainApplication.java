package observer;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        Publisher laptopPublisher = new LaptopPublisher();
        Publisher tabletPublisher = new TabletPublisher();
        EmailObserver emailObserver = new EmailObserver("abc@gmail.com", laptopPublisher);
        SMSObserver smsObserver = new SMSObserver("91652088998", laptopPublisher);

        laptopPublisher.registerObserver(emailObserver);
        laptopPublisher.registerObserver(smsObserver);
        laptopPublisher.setData(100);
      //  emailObserver.getPublisher().getData();

        laptopPublisher.setData(0);
        laptopPublisher.setData(10);
      //  smsObserver.getPublisher().getData();

        EmailObserver emailObserver2 = new EmailObserver("def@gmail.com", tabletPublisher);
        SMSObserver smsObserver2 = new SMSObserver("7580894653", tabletPublisher);
        tabletPublisher.registerObserver(emailObserver2);
        tabletPublisher.registerObserver(smsObserver2);

        tabletPublisher.setData(5);
       // smsObserver2.getPublisher().getData();
       // tabletPublisher.setData(0);
        tabletPublisher.setData(29);
        smsObserver2.getPublisher().getData();
    }
}
