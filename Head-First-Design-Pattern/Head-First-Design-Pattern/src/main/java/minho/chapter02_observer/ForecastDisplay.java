package minho.chapter02_observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float pressure;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.lastPressure = 0f;
        this.pressure = 29.92f;
    }

    @Override
    public void display() {
        String msg = "기상예보: ";

        if (this.lastPressure > this.pressure) msg += "쌀쌀하며 비가 올 것 같습니다.";
        else if (this.lastPressure < this.pressure) msg += "날씨가 좋아지고 있습니다.";
        else msg += "지금과 비슷할 것 같습니다.";

        System.out.println(msg);
    }

    @Override
    public void update() {
        this.lastPressure = this.pressure;
        this.pressure = this.weatherData.getPressure();
        display();
    }
}
