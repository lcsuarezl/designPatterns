package ch01.introToDesignPatterns.i03;

public class Main {

  public static void main(String args[]) {
    Duck duck = new Duck(); 
    MallardDuck mallardDuck = new MallardDuck();
    RedheadDuck redheadDuck = new RedheadDuck(); 
    RubberDuck rubberDuck = new RubberDuck();
    DecoyDuck decoyDuck = new DecoyDuck();
    duck.display();
    mallardDuck.display();
    mallardDuck.quack();
    mallardDuck.fly();
    redheadDuck.display();
    rubberDuck.display();
    //rubberDuck.fly();
    decoyDuck.display();
    //decoyDuck.fly();
    //decoyDuck.quack();
  }
  
}
