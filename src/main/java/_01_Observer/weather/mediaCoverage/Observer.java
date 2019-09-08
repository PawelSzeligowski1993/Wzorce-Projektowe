package _01_Observer.weather.mediaCoverage;

import _01_Observer.weather.weatherStatus.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
