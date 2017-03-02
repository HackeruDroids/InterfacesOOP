package edu.tomer.java.ducksim;

import edu.tomer.java.ducksim.behaviours.FlyNoWay;
import edu.tomer.java.ducksim.behaviours.Squeak;

/**
 * Created by hackeru on 02/03/2017.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Rubber duck");
    }

}
