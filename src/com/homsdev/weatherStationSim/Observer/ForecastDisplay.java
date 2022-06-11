package com.homsdev.weatherStationSim.Observer;

import com.homsdev.weatherStationSim.Subject.Subject;

public class ForecastDisplay implements DisplayElement,Observer{

    private float temp;
    private Subject dataCenter;

    public ForecastDisplay(Subject dataCenter) {
        this.dataCenter = dataCenter;
        dataCenter.registerObserver(this);
    }

    @Override
    public void display() {
        String data = String.format("Forecast display: Temperature %.2f",temp);
        System.out.println(data);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp= temp;
        display();
    }

    @Override
    public void unsubscribe(){
        dataCenter.removeObserver(this);
    }
}
