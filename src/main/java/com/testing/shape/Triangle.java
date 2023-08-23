package com.testing.shape;

public class Triangle implements Shape{
    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public String getField() {
        return "Triangle surface area: 15";
    }
}
