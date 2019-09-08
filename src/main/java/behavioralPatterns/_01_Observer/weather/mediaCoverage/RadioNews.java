package behavioralPatterns._01_Observer.weather.mediaCoverage;

import behavioralPatterns._01_Observer.weather.weatherStatus.WeatherForecast;

public class RadioNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("RADIONEWS = Pogoda = Temperature = "+weatherForecast.getTemperature()+", Pressure = "+weatherForecast.getPresure() );
    }
}
