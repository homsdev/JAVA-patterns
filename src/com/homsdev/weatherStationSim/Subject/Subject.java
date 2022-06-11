package com.homsdev.weatherStationSim.Subject;

import com.homsdev.weatherStationSim.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
