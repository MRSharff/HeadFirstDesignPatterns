package dev.msharff.weathermonitoringstation;

import java.util.LinkedList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private int windowSize = 20;
    private float runningTotal = 0;
    private LinkedList<Float> window;

    private float avgTemp;
    private float minTemp = 10000;
    private float maxTemp = -10000;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        window = new LinkedList<>();
        windowSize = 20;
    }

    @Override
    public void display() {
        System.out.println(
            "Weather Stats: " + "Avg. temp: " + avgTemp + " Min. temp: " + minTemp + " Max. temp: " + maxTemp
        );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (temp < minTemp) {
            minTemp = temp;
        }

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        boolean isWindowFull = window.size() == windowSize;
        if (isWindowFull) {
            runningTotal -= window.removeFirst();
        }

        window.add(temp);
        runningTotal += temp;
        avgTemp = runningTotal / window.size();
        display();
    }
}
