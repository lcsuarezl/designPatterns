package ch01.introToDesignPatterns.i05;

import ch01.introToDesignPatterns.i05.Duck;
import ch01.introToDesignPatterns.i04.c.FlyNoWay;
import ch01.introToDesignPatterns.i04.c.Quack;
public class ModelDuck extends Duck{

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }
  
  @Override
  public void display() {
   System.out.println("I'm a model duck");
    
  }

}
