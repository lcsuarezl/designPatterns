package ch01.introToDesignPatterns.i02;

public class Main {

  public static void main(String args[]) {
    Duck duck = new Duck(); 
    MallardDuck mallardDuck = new MallardDuck();
    RedheadDuck redheadDuck = new RedheadDuck(); 
    
    duck.display();
    mallardDuck.display();
    redheadDuck.display();
  }
  
}
