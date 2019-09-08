package _01_Observer.weather;

import _01_Observer.weather.mediaCoverage.InternetNews;
import _01_Observer.weather.mediaCoverage.RadioNews;
import _01_Observer.weather.mediaCoverage.SmsAlert;
import _01_Observer.weather.mediaCoverage.TvNews;
import _01_Observer.weather.weatherStatus.WeatherForecast;

public class main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(20,1024, 120.5);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();
        SmsAlert smsAlert = new SmsAlert();

        internetNews.updateForecast(weatherForecast);
        radioNews.updateForecast(weatherForecast);
        tvNews.updateForecast(weatherForecast);

        if (weatherForecast.getWindSpeed()> 60){
            smsAlert.updateForecast(weatherForecast);
        }

        weatherForecast.notifyObservers();

    }
}
