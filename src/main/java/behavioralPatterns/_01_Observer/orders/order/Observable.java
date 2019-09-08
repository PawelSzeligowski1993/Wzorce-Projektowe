package behavioralPatterns._01_Observer.orders.order;

import behavioralPatterns._01_Observer.orders.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
