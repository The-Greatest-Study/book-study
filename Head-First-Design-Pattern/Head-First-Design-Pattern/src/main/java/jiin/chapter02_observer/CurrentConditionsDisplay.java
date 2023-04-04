package jiin.chapter02_observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.println("** Current Condition **");
        System.out.println(" - 온도 : " + temperature + "F");
        System.out.println(" - 습도 : " + humidity + "%");
        System.out.println(" - 기압 : " + pressure);
        System.out.println();
    }
}
