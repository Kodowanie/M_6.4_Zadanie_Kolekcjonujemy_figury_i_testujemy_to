package com.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {



    @Nested
    @DisplayName("Figure manipulation")
    class TestFigures1{

        @Test
        void testAddFigure (){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle();
            //When
            shapeCollector.addFigure(shape1);
            //Then
            Assertions.assertEquals(1,shapeCollector.getFigure(0));

        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle();
            shapeCollector.addFigure(shape1);
            //When
            boolean result = shapeCollector.removeFigure(shape1);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals("Circle",shapeCollector.showFigures());
        }



    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle();
        shapeCollector.addFigure(shape1);
        //When
        Shape retriveFigure = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(shape1,retriveFigure);
    }

    @Test
    void testShowFigure(){

    }



}
