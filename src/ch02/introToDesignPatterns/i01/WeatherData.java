package ch02.introToDesignPatterns.i01;

import java.util.Random;

public class WeatherData {
 
  private float temp;
  private float humidity;
  private float pressure;
  
  private Random rn = new Random();
 
  private CurrentConditionsDisplay currentConditionsDisplay;
  private ForecastDisplay forecastDisplay;
  private StatisticsDisplay statisticsDisplay; 
  
  
  
  public WeatherData(CurrentConditionsDisplay currentConditionsDisplay, ForecastDisplay forecastDisplay,
      StatisticsDisplay statisticsDisplay) {
    super();
    this.currentConditionsDisplay = currentConditionsDisplay;
    this.forecastDisplay = forecastDisplay;
    this.statisticsDisplay = statisticsDisplay;
  }


  public void measurementsChanged() {
      this.temp = getTemperature(); 
      this.humidity = getHumidity();
      this.pressure= getPressure();
      
      currentConditionsDisplay.update(temp, humidity, pressure);
      forecastDisplay.update(temp, humidity, pressure);
      statisticsDisplay.update(temp, humidity, pressure);
  }
  
  
  public float getTemperature() {
    return  rn.nextInt(20 - 10 + 1) + 10 + rn.nextFloat();
  }
  
  public float getHumidity() {
    return rn.nextInt(20 - 5 + 1) + 5;
  }
  
  public float getPressure() {
    return rn.nextInt(150 - 10 + 1) + 10;
  }
  
  
}
