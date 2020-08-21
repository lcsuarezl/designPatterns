package ch01.introToDesignPatterns.i04;

import ch01.introToDesignPatterns.i04.c.FlyNoWay;
import ch01.introToDesignPatterns.i04.c.Quack;

public class RubberDuck extends Duck {

  public RubberDuck () {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  
  public void display() {
    System.out.println("Show a Rubber duck");
  }
 

}
