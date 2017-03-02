package edu.tomer.java.ducksim;

import edu.tomer.java.ducksim.behaviours.FlyWithWings;
import edu.tomer.java.ducksim.behaviours.Quack;

/**
 * Created by hackeru on 02/03/2017.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like a Red Head.");
    }
}
