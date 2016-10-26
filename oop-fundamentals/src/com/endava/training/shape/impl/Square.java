package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by inastase on 10/26/2016.
 */
public class Square implements Shape2D {

    public static float x;
    public static float y;

    public Square(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double computeArea() {
        double area = 0;
        area = x * y;
        return area;

    }

    @Override
    public double computePerimeter() {
        double perimeter = 0;
        perimeter = 4 * x;
        return perimeter;

    }
}
