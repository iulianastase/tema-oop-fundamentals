package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by inastase on 10/26/2016.
 */
public class Triangle implements Shape2D {
    //triunghi dreptunghic echilateral
    public static float x;
    public static float y;

    public Triangle(float x, float y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public double computeArea() {
        double area = 0;
        area = 1/2 * (x * y); // x e baza iar y inaltimea
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = 0;
        perimeter = x + y + y;
        return perimeter;
    }
}
