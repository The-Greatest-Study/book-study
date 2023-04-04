package chapter02_observer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatureList;
    private String yyyymmdd;

    private float averageTemperature;
    private float maxTemperature;
    private float minTemperature;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        temperatureList = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        yyyymmdd = dateFormat.format(new Date());
    }

    @Override
    public void update() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String today = dateFormat.format(new Date());

        if(yyyymmdd.compareTo(today) < 0){
            yyyymmdd = today;
            temperatureList.clear();
        }

        temperatureList.add(weatherData.getTemperature());

        averageTemperature = (float) temperatureList.stream()
                .mapToDouble(Float::doubleValue)
                .average()
                .orElse(Double.NaN);

        minTemperature = temperatureList.stream()
                .min(Float::compareTo)
                .orElse(Float.MAX_VALUE);

        maxTemperature = temperatureList.stream()
                .max(Float::compareTo)
                .orElse(Float.MIN_VALUE);

        display();
    }

    @Override
    public void display() {
        System.out.println("** 기상 통계 **");
        System.out.println(" - 평균 온도 : " + averageTemperature + "F");
        System.out.println(" - 최저 온도 : " + minTemperature + "F");
        System.out.println(" - 최고 온도 : " + maxTemperature + "F");
        System.out.println();
    }
}
