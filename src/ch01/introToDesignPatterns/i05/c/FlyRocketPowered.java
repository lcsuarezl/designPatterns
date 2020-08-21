package ch01.introToDesignPatterns.i05.c;

import ch01.introToDesignPatterns.i04.i.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior{

  @Override
  public void fly() {
    System.out.println("I'm flying witha rocket!");
  }

}
