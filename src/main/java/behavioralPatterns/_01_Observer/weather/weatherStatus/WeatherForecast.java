package behavioralPatterns._01_Observer.weather.weatherStatus;

import behavioralPatterns._01_Observer.weather.mediaCoverage.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    int temperature;
    int presure;
    double windSpeed;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int presure, double windSpeed ) {
        this.temperature = temperature;
        this.presure = presure;
        this.windSpeed = windSpeed;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }
    public void unregisterObserver(Observer observer) {
    registeredObservers.remove(observer);
    }

    public void notifyObservers() {
    for (Observer observer : registeredObservers){
        observer.updateForecast(this);
    }
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPresure() {
        return presure;
    }

    public void setPresure(int presure) {
        this.presure = presure;
    }

    public double getWindSpeed(){
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed){
        this.windSpeed = windSpeed;
    }
}
