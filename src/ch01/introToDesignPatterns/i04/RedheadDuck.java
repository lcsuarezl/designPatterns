package ch01.introToDesignPatterns.i04;

import ch01.introToDesignPatterns.i04.c.FlyWithWings;
import ch01.introToDesignPatterns.i04.c.Quack;

public class RedheadDuck extends Duck {

  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }
  
  public void display() {
    System.out.println("Show a Redhead duck");
  }
}
