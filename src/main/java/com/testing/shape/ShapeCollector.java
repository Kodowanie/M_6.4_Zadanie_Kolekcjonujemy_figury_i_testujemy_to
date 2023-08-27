package com.testing.shape;

import java.util.*;

public class ShapeCollector
{

    public List<Shape> listCollectShape =  new ArrayList<>();
    Shape shape;

    public void addFigure(Shape shape){
        Shape square1 = new Square(shape.getShapeName(), shape.getField());
        listCollectShape.add(square1);
        Shape circle1 = new Circle( shape.getShapeName(), shape.getField());
        listCollectShape.add(circle1);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (listCollectShape.contains(shape)){
            listCollectShape.remove(shape);
        }
        return result;
    }
    public Shape getFigure(int n){
        if (n >= 0 && n < listCollectShape.size()){
            return listCollectShape.get(n);
        }
        return null;
    }
    public String showFigures(){
        return null;
    }


}
