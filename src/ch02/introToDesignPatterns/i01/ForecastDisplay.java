package ch02.introToDesignPatterns.i01;

public class ForecastDisplay {

  private float[] temps;
  private float[] humidities;
  private float[] pressures;

  public void display() {
    System.out.printf("Forecast temperature: %.2f \n", getForecast(temps));
    System.out.printf("Forecast humidity: %.2f \n", getForecast(humidities));
    System.out.printf("Forecast pressure: %.2f \n", getForecast(pressures));
  }

  public void update(float temp, float humidity, float pressure) {
    temps = addNewValue(temps, temp);
    humidities = addNewValue(humidities, humidity);
    pressures = addNewValue(pressures, pressure);
  }

  private float[] addNewValue(float[] array, float value) {
    if (array == null) {
      array = new float[2];
    }
    array[0] = array[1];
    array[1] = value;
    return array;
  }

  private float getForecast(float[] array) {
    float step = array[1] - array[0];
    return (array[1] + array[0] / array.length) + step;
  }
}
