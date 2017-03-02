package edu.tomer.java.ducksim;

import edu.tomer.java.ducksim.behaviours.FlyBehaviour;
import edu.tomer.java.ducksim.behaviours.FlyWithWings;
import edu.tomer.java.ducksim.behaviours.Quack;
import edu.tomer.java.ducksim.behaviours.QuackBehaviour;

/**
 * Created by hackeru on 02/03/2017.
 */
public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
