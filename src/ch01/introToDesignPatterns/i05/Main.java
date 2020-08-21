package ch01.introToDesignPatterns.i05;

import ch01.introToDesignPatterns.i05.c.FlyRocketPowered;

public class Main {

  public static void main(String args[]) {
    MallardDuck mallardDuck = new MallardDuck();
    RedheadDuck redheadDuck = new RedheadDuck(); 
    RubberDuck rubberDuck = new RubberDuck();
    DecoyDuck decoyDuck = new DecoyDuck();
    ModelDuck modelDuck = new ModelDuck();

    mallardDuck.display();
    mallardDuck.performFly();
    mallardDuck.performQuack();
    
    redheadDuck.display();
    redheadDuck.performFly();
    redheadDuck.performQuack();
    
    rubberDuck.display();
    rubberDuck.performFly();
    rubberDuck.performQuack();
    
    decoyDuck.display();
    decoyDuck.performFly();
    decoyDuck.performQuack();
    
    modelDuck.display();
    modelDuck.performFly();
    modelDuck.performQuack();
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();
    
  }
  
}
