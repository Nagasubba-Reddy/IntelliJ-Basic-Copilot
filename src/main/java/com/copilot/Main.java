package com.copilot;

// create an interface shapeable with a method called draw
interface Shapeable {
    void draw();
}
// create abstract class Shape with property name which implements Shapeable interface
abstract class Shape implements Shapeable {
    String name;
    Shape(String name) {
        this.name = name;
    }
}
// create class Circle which extends Shape class with property radius
class Circle extends Shape {
    int radius;
    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    // implement draw method from Shapeable interface
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
// create class Rectangle which extends Shape class with properties width and height
class Rectangle extends Shape {
    int width;
    int height;
    Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    // implement draw method from Shapeable interface
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}
// create class square  which extends Shape class with property side
class Square extends Shape {
    int side;
    Square(String name, int side) {
        super(name);
        this.side = side;
    }
    // implement draw method from Shapeable interface
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // call arraydemo method from ArrayUtil class
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
        arrayUtil.arrayDemoStream();
    }
}