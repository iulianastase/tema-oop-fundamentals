package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by inastase on 10/26/2016.
 */
public class Circle implements Shape2D {
    static final double PI = 3.14159;
    static  float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        double area = 0;
        area = PI * (radius * radius);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = 0;
        perimeter = 2 * PI * radius;
        return perimeter;

    }
}
