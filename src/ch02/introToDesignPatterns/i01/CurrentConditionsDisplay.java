package ch02.introToDesignPatterns.i01;

public class CurrentConditionsDisplay {
  
  private float temp; 
  private float humidity; 
  private float pressure; 
  
  
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp; 
    this.humidity = humidity; 
    this.pressure = pressure; 
  }
  
  public void display() {
    System.out.printf("Current Temperature %.2f \n", temp);
    System.out.printf("Current Humidity %.2f \n", humidity);
    System.out.printf("Current Pressure %.2f \n", pressure);
  }

}
