package com.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private String shapeSquare;
    private int fieldSquare;

    public Square(String shapeName, int field) {
        this.shapeSquare = shapeName;
        this.fieldSquare = field;
    }

    @Override
    public String getShapeName() {

        return shapeSquare ;
    }

    @Override
    public int getField() {

        return fieldSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (fieldSquare != square.fieldSquare) return false;
        return Objects.equals(shapeSquare, square.shapeSquare);
    }

    @Override
    public int hashCode() {
        int result = shapeSquare != null ? shapeSquare.hashCode() : 0;
        result = 31 * result + fieldSquare;
        return result;
    }
}
