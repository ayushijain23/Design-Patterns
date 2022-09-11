package observer;

public interface Publisher {
    public void registerObserver(Observer obs);
    public void unsubscribeObserver(Observer obs);
    public void notifyObserver();
    public void setData(int stock);
    public void getData();
}
