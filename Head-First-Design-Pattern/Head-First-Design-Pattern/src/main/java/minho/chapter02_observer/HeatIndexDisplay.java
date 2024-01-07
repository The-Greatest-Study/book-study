package minho.chapter02_observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float hIndexTemp;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.hIndexTemp = 0.0f;
    }

    @Override
    public void display() {
        System.out.println("Heat index는 " + this.hIndexTemp);
    }

    @Override
    public void update() {
        this.hIndexTemp = computeHeatIndex();
        display();
    }

    private float computeHeatIndex() {
        float temperature = weatherData.getTemperature();
        float humidity = weatherData.getHumidity();
        float index =
                (float)
                        ((16.923
                                        + (0.185212 * temperature)
                                        + (5.37941 * humidity)
                                        - (0.100254 * temperature * humidity)
                                        + (0.00941695 * (temperature * temperature))
                                        + (0.00728898 * (humidity * humidity))
                                        + (0.000345372 * (temperature * temperature * humidity))
                                        - (0.000814971 * (temperature * humidity * humidity))
                                        + (0.0000102102
                                                * (temperature * temperature * humidity * humidity))
                                        - (0.000038646 * (temperature * temperature * temperature))
                                        + (0.0000291583 * (humidity * humidity * humidity))
                                        + (0.00000142721
                                                * (temperature
                                                        * temperature
                                                        * temperature
                                                        * humidity))
                                        + (0.000000197483
                                                * (temperature * humidity * humidity * humidity))
                                        - (0.0000000218429
                                                * (temperature
                                                        * temperature
                                                        * temperature
                                                        * humidity
                                                        * humidity))
                                        + 0.000000000843296
                                                * (temperature
                                                        * temperature
                                                        * humidity
                                                        * humidity
                                                        * humidity))
                                - (0.0000000000481975
                                        * (temperature
                                                * temperature
                                                * temperature
                                                * humidity
                                                * humidity
                                                * humidity)));
        return index;
    }
}
