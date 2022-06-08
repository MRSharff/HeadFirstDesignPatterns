package dev.msharff.weathermonitoringstation;

public class Forecast implements Observer, DisplayElement {

    String forecast = "N/A";
    WeatherData weatherData;

    public Forecast(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "Forecast: " + forecast
        );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (pressure < .1 && humidity > .1) {
            forecast = "Rain";
            display();
            return;
        }

        float hpRatio = humidity / pressure;
        if (hpRatio > .5) {
            forecast = "Rain";
        } else if (temp > 60){
            forecast = "Sunny";
        } else {
            forecast = "Clear";
        }
        display();
    }
}
