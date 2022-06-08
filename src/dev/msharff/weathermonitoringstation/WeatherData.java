package dev.msharff.weathermonitoringstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return 0;
    }

    public float getHumidity() {
        return 0;
    }

    public float getPressure() {
        return 0;
    }

    /*
     * This method gets called whenever the
     * weather measurements have been updated.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        // TODO: Looks like we can add an observer more than once here.
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

