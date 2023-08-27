package com.testing.shape;

import org.junit.jupiter.api.*;
import com.testing.shape.ShapeCollector;

import java.util.Collection;



@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test Square")
    class TestFigures1{

        @Test
        void testAddFigure (){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square ("Square1" , 2);
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertEquals(square,shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1" , 2);
            shapeCollector.addFigure(square1);
            //When
            shapeCollector.removeFigure(square1);
            //Then
            Assertions.assertEquals(1,shapeCollector.listCollectShape.size());

        }
        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1", 2);
            Shape square2 = new Square("Square2", 4);
            shapeCollector.addFigure(square1);
            shapeCollector.addFigure(square2);
            //When
            Shape squareOne = shapeCollector.getFigure(0);
            Shape squareTwo = shapeCollector.getFigure(2);
            //Then
            Assertions.assertEquals(square1,squareOne);
            Assertions.assertEquals(square2,squareTwo);
        }

        @Test
        void testShowFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square ("Square1" , 2);
            Shape square2 = new Square ("Square2" ,2);
            //When
            shapeCollector.addFigure(square1);
            shapeCollector.addFigure(square2);
            //Then
            shapeCollector.showFigures();
        }

    }


    @Nested
    @DisplayName("Test Circle")
    class TestFigures2{

        @Test
        void testAddFigure (){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle ("Circle",2);
            //When
            shapeCollector.addFigure(circle1);
            //Then
            Assertions.assertEquals(circle1,shapeCollector.getFigure(1));
        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle ("Circle",2);
            shapeCollector.addFigure(circle1);
            //When
            shapeCollector.removeFigure(circle1);
            //Then
            Assertions.assertEquals(1,shapeCollector.listCollectShape.size());
        }
        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle ("Circle1", 2);
            Shape circle2 = new Circle("Circle2", 4);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);
            //When
            Shape circleOne = shapeCollector.getFigure(1);
            Shape circleTwo = shapeCollector.getFigure(3);
            //Then
            Assertions.assertEquals(circle1,circleOne);
            Assertions.assertEquals(circle2,circleTwo);
        }

        @Test
        void testShowFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle ("Circle1" , 2);
            Shape circle2 = new Circle ("Circle2" ,2);
            //When
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);
            //Then
            shapeCollector.showFigures();
        }


    }


}
