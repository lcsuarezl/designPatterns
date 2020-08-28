package ch02.introToDesignPatterns.i01;

public class StatisticsDisplay {

  private float[] temps;
  private float[] humidities;
  private float[] pressures;

  public void display() {
    System.out.printf("Temperature Average: %.2f \n", getAverage(temps));
    System.out.printf("Humidity Average: %.2f \n", getAverage(humidities));
    System.out.printf("Pressure Average: %.2f \n", getAverage(pressures));
  }

  public void update(float temp, float humidity, float pressure) {
    temps = addNewValue(temps, temp);
    humidities = addNewValue(humidities, humidity);
    pressures = addNewValue(pressures, pressure);
  }

  private float[] addNewValue(float[] array, float value) {
    float[] aux = array;
    if (aux != null) {
      array = new float[aux.length + 1];
      copyArray(aux, array);
      array[aux.length] = value;
    } else {
      array = new float[1];
      array[0] = value;
    }
    return array;
  }

  private void copyArray(float[] source, float[] target) {
    for (int i = 0; i < source.length; i++) {
      target[i] = source[i];
    }
  }

  private float getAverage(float[] array) {
    float sum = 0;
    for (float f : array) {
      sum = +f;
    }
    return sum / array.length;
  }

}
