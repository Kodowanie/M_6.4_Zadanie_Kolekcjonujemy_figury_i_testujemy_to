package com.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String nameCircle;
    private int fieldCircle;

    public Circle(String nameCircle, int fieldCircle) {
        this.nameCircle = nameCircle;
        this.fieldCircle = fieldCircle;
    }

    @Override
    public String getShapeName() {
        return nameCircle ;
    }

    @Override
    public int getField() {

        return fieldCircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (fieldCircle != circle.fieldCircle) return false;
        return Objects.equals(nameCircle, circle.nameCircle);
    }

    @Override
    public int hashCode() {
        int result = nameCircle != null ? nameCircle.hashCode() : 0;
        result = 31 * result + fieldCircle;
        return result;
    }
}
