package behavioralPatterns._01_Observer.weather.mediaCoverage;

import behavioralPatterns._01_Observer.weather.weatherStatus.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
