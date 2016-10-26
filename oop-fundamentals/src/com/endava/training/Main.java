package com.endava.training;

import com.endava.training.examples.ExtendedSimple;
import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;
import com.endava.training.examples.A;
import com.endava.training.examples.B;
import com.endava.training.examples.C;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello OOP!");

        Circle circle = new Circle(3);
        System.out.println("The area of the circle is: " + circle.computeArea());
        System.out.println("The perimeter of the circle is: " + circle.computePerimeter());

        Square square = new Square(4,4);
        System.out.println("The area of the square is: " + square.computeArea());
        System.out.println("The perimeter of the square is: " + square.computePerimeter());

        Triangle triangle = new Triangle(3,5);
        System.out.println("The area of the triangle is: " + triangle.computeArea());
        System.out.println("The perimeter of the triangle is: " + triangle.computePerimeter());

        ExtendedSimple exts0 = new ExtendedSimple();
        ExtendedSimple exts1 = new ExtendedSimple(4);
        ExtendedSimple exts2 = new ExtendedSimple(4,6);

        A a = new B();
        a.f();
        B b = new C();
        b.f();
        A a0 = new C();
        a0.f();
        A a1 = new A();
        a1.f();

        A mood = new A();
        mood.f("sad");

        A mood1 = new A();
        mood.f("sunny", "happy");
    }
}
