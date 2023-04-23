package jiin.chapter02_observer;

public class WeatherStation {
    public static void main(String[] args) {
        System.out.println("****************************************");
        System.out.println("Chapter 02. Observer Pattern");
        System.out.println("****************************************");
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("****************************************");

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("****************************************");

        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("****************************************");
    }
}
