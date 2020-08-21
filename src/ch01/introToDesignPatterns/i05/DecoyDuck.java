package ch01.introToDesignPatterns.i05;

import ch01.introToDesignPatterns.i04.c.FlyNoWay;
import ch01.introToDesignPatterns.i04.c.MuteQuack;

public class DecoyDuck extends Duck {

  
  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }
  
  public void display() {
    System.out.println("Show a Decoy duck");
  }
 

}
