package ch01.introToDesignPatterns.i05;

import ch01.introToDesignPatterns.i04.i.IFlyBehavior;
import ch01.introToDesignPatterns.i04.i.IQuackBehavior;

public abstract class Duck {
  
  IFlyBehavior flyBehavior; 
  IQuackBehavior quackBehavior; 
  
  void performFly() {
    flyBehavior.fly();
  }
  
  void performQuack(){
    quackBehavior.quack();
  }
  
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
  
  public abstract void display();

  public void setFlyBehavior(IFlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(IQuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
  
  
  
}
