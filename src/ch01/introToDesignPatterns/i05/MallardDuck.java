package ch01.introToDesignPatterns.i05;

import ch01.introToDesignPatterns.i04.c.FlyWithWings;
import ch01.introToDesignPatterns.i04.c.Quack;
import ch01.introToDesignPatterns.i04.i.IFlyBehavior;
import ch01.introToDesignPatterns.i04.i.IQuackBehavior;

public class MallardDuck extends Duck{
  
  public MallardDuck() {
   quackBehavior = new Quack();
   flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("Show a Mallard duck");
  }
  
}
