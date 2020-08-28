package ch02.introToDesignPatterns.i01;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    WeatherData weatherData = new WeatherData(currentConditionsDisplay, forecastDisplay, statisticsDisplay);
    for (int i = 0; i < 10; i++) {
      weatherData.measurementsChanged();
      System.out.println("Measures changed..");
      currentConditionsDisplay.display();
      statisticsDisplay.display();
      forecastDisplay.display();
      Thread.sleep(2000);
    }
  }

}
