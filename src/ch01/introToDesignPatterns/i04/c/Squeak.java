package ch01.introToDesignPatterns.i04.c;

import ch01.introToDesignPatterns.i04.i.IQuackBehavior;

public class Squeak implements IQuackBehavior{

  @Override
  public void quack() {
    System.out.println("I do Squeak");
  }

}
