package behavioralPatterns._01_Observer.weather.mediaCoverage;

import behavioralPatterns._01_Observer.weather.weatherStatus.WeatherForecast;

public class TvNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TVNEWS = Pogoda = Temperature = "+weatherForecast.getTemperature()+", Pressure = "+weatherForecast.getPresure() );
    }

}
