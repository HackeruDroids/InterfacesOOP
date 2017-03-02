package edu.tomer.java.ducksim;

import edu.tomer.java.ducksim.behaviours.FlyNoWay;
import edu.tomer.java.ducksim.behaviours.MuteQuack;

/**
 * Created by hackeru on 02/03/2017.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Decoy duck");
    }
}
