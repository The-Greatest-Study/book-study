package minho.chapter02_observer;

public class StatisticsDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float temperature;
    private float maxTemp;
    private float minTemp;
    private float sumTemp;
    private int numReading;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.maxTemp = Float.MIN_VALUE;
        this.minTemp = Float.MAX_VALUE;
        this.sumTemp = 0f;
        this.numReading = 0;
    }

    @Override
    public void display() {
        float avgTemp = 0f;
        if(numReading != 0) avgTemp = sumTemp / numReading;

        final String msg = new StringBuilder("평균/최고/최저 온도 = ")
                .append(avgTemp).append("/").append(maxTemp).append("/").append(minTemp).toString();
        System.out.println(msg);
    }

    @Override
    public void update() {
        this.numReading += 1;
        float curTemp = weatherData.getTemperature();
        this.sumTemp += curTemp;
        if(curTemp < minTemp) minTemp = curTemp;
        if(curTemp > maxTemp) maxTemp = curTemp;
        display();
    }
}
