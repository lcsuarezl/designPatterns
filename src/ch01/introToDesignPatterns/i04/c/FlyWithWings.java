package ch01.introToDesignPatterns.i04.c;

import ch01.introToDesignPatterns.i04.i.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior{

  @Override
  public void fly() {
    System.out.println("Flying with wings");
  }

}
