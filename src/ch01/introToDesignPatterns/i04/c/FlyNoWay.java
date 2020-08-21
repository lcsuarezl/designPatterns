package ch01.introToDesignPatterns.i04.c;

import ch01.introToDesignPatterns.i04.i.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior{

  @Override
  public void fly() {
    System.out.println("I Can't Fly");
  }

}
