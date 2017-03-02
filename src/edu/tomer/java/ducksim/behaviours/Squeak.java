package edu.tomer.java.ducksim.behaviours;

/**
 * Created by hackeru on 02/03/2017.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
