package com.endava.training.examples;

/**
 * Created by inastase on 10/26/2016.
 */
public class ExtendedSimple extends Simple {

    public ExtendedSimple(int i) {
        super(i);
        System.out.println("Hello from contructor with 1 args");
    }
    public ExtendedSimple () {
        super();
        System.out.println("Hello from contructor with 0 args");
    }
    public ExtendedSimple (int i, int j){
        super();
        System.out.println("Hello from contructor with 2 args");
    }
}
