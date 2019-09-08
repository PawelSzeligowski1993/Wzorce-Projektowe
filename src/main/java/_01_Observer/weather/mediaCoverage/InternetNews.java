package _01_Observer.weather.mediaCoverage;

import _01_Observer.weather.weatherStatus.WeatherForecast;

public class InternetNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("INTERNETNEWS = Pogoda = Temperature = "+weatherForecast.getTemperature()+", Pressure = "+weatherForecast.getPresure() );
    }
}
