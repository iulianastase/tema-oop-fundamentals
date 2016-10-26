package com.endava.training.examples;

/**
 * Created by inastase on 10/26/2016.
 */
public class A {
    public A() {
    }
    public  void f()
    {
        System.out.println("Hello from A!");
    }
    public void f(String mood)
    {
        System.out.println("This weather makes me feel " + mood);
    }
    public void f(String weather, String mood)
    {
        System.out.println("I'm feeling " + mood + " because outside is " + weather);
    }
}
