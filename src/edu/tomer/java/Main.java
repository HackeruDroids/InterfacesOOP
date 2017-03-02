package edu.tomer.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Moe", "Cohen");
        Person p2 = new Person("Joe", "Cohen");
        Person p3 = new Person("Dave", "David");

        //polymorphysm of interface
        List<Person> people = new ArrayList<Person>();

        people.add(p1);
        people.add(p2);
        people.add(p3);

        Collections.sort(people);

        System.out.println(people);

    }

}
