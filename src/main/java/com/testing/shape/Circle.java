package com.testing.shape;

public class Circle implements Shape{
    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public String getField() {
        return "Circle surface area: 20";
    }
}
