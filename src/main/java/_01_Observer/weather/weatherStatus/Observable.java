package _01_Observer.weather.weatherStatus;

import _01_Observer.weather.mediaCoverage.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
