package com.homsdev.weatherStationSim.Observer;

import com.homsdev.weatherStationSim.Subject.Subject;

public class StatisticsDisplay implements DisplayElement,Observer{

    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherDataCenter;

    public StatisticsDisplay(Subject weatherDataCenter) {
        this.weatherDataCenter = weatherDataCenter;
        weatherDataCenter.registerObserver(this);
    }

    @Override
    public void display() {
       String data = String.format("Statistics display: Temperature %.2f | Humidity %.2f | Pressure %.2f",temp,humidity,pressure);
       System.out.println(data);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void unsubscribe() {
        weatherDataCenter.removeObserver(this);
    }
}
