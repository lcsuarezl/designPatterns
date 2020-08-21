package ch01.introToDesignPatterns.i03;

import ch01.introToDesignPatterns.i03.i.IFlyable;
import ch01.introToDesignPatterns.i03.i.IQuackable;

public class MallardDuck extends Duck implements IQuackable, IFlyable{
  
  public void quack() {
    System.out.println("do quack like Mallard");
  }
  
  public void fly() {
    System.out.println("Fly like a Mallard");
  }

  public void display() {
    System.out.println("Show a Mallard duck");
  }
  
}
