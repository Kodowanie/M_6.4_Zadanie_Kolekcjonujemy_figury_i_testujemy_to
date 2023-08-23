package com.testing.shape;

public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public String getField() {
        return "Square surface area: 10";
    }
}
