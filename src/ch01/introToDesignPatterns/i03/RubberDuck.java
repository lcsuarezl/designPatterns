package ch01.introToDesignPatterns.i03;

import ch01.introToDesignPatterns.i03.i.IQuackable;

public class RubberDuck extends Duck implements IQuackable {

  public void quack() {
    System.out.println("do squeak");
  }
  
  public void display() {
    System.out.println("Show a Rubber duck");
  }
 

}
