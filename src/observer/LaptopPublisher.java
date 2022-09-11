package observer;

import java.util.ArrayList;
import java.util.List;

public class LaptopPublisher implements Publisher{
    private int stock;
    private List<Observer> observers;

    public LaptopPublisher(){
        this.stock = 0;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unsubscribeObserver(Observer obs) {
        observers.remove(observers.indexOf(obs));
    }

    @Override
    public void notifyObserver() {
          for(Observer obj : observers){
              obj.update();
          }
    }

    @Override
    public void setData(int newstock) {
        if(stock == 0){
            stock = stock + newstock;
            notifyObserver();
        }
        else if(newstock == 0){
            stock = 0;
        }
        else{
            stock+= newstock;
        }

    }

    @Override
    public void getData() {
        System.out.println("TInside Laptop getdata Stocks:"+ stock);
    }
}
