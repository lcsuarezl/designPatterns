package ch01.introToDesignPatterns.i03;

import ch01.introToDesignPatterns.i03.i.IFlyable;
import ch01.introToDesignPatterns.i03.i.IQuackable;

public class RedheadDuck extends Duck implements IQuackable, IFlyable{

  public void quack() {
    System.out.println("do quack like a Redhead duck");
  }
  
  public void fly() {
    System.out.println("Fly like a Redhead duck");
  }
  
  public void display() {
    System.out.println("Show a Redhead duck");
  }
}
