package minho.chapter02_observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        final String msg =
                new StringBuilder("현재 상태 : 온도 ")
                        .append(temperature)
                        .append("F, 습도 ")
                        .append(humidity)
                        .append("%")
                        .toString();
        System.out.println(msg);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
