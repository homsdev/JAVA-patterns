package com.homsdev.observerPattern;

import com.homsdev.observerPattern.Observer.ForecastDisplay;
import com.homsdev.observerPattern.Observer.Observer;
import com.homsdev.observerPattern.Observer.StatisticsDisplay;
import com.homsdev.observerPattern.Subject.WeatherData;

public class WeatherTest {
    public static void main(String[] args) {
        WeatherData weatherDataCenter= new WeatherData();
        Observer statisticsDisplay= new StatisticsDisplay(weatherDataCenter);
        Observer forecastDisplay = new ForecastDisplay(weatherDataCenter);
        weatherDataCenter.setMeasurements(15.12f,18f,90.2f);
        forecastDisplay.unsubscribe();
        System.out.println("===updated===");
        weatherDataCenter.setMeasurements(25.2f,14.2f,110f);
    }
}
