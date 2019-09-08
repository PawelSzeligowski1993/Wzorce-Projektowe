package behavioralPatterns._01_Observer.weather.mediaCoverage;

import behavioralPatterns._01_Observer.weather.weatherStatus.WeatherForecast;

public class SmsAlert implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Uwaga Alert możliwe silne burze na terenie kraju," +
                "\npredkość wiatru = " + weatherForecast.getWindSpeed()+" km/h");
    }
}
