package edu.tomer.java;

import java.util.Comparator;

/**
 * Created by hackeru on 02/03/2017.
 */
public class PeopleComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }
}
