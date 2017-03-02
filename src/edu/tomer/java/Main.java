package edu.tomer.java;

import edu.tomer.java.ducksim.Duck;
import edu.tomer.java.ducksim.MallardDuck;
import edu.tomer.java.ducksim.behaviours.FlyNoWay;
import edu.tomer.java.ducksim.behaviours.Squeak;

public class Main {

    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.performFly();
        d.setFlyBehaviour(new FlyNoWay());
        d.performQuack();

        d.setQuackBehaviour(new Squeak());
        d.performFly();
        d.performQuack();

    }

}
