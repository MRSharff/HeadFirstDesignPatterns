package dev.msharff.weathermonitoringstation;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
